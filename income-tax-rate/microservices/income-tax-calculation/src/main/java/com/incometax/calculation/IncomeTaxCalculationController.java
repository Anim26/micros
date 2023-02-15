package com.incometax.calculation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(path="income-tax-calculation")
public class IncomeTaxCalculationController {
	@Autowired
	private IncomeTaxCalculationProxy proxy;
	@Autowired
	private IncomeTaxCalculation incomeTaxCalculation; 
	
@GetMapping(path="Regime/{taxRegime}/income-range/{incomeRange}/income/{income}/deduction/{deduction}")	
	public IncomeTaxCalculation getIncomeTax(@PathVariable String taxRegime, @PathVariable String incomeRange,
			 @PathVariable double income,@PathVariable double deduction) {
		
	double taxRate=proxy.retriveTaxRate(taxRegime, incomeRange);
	double tax=(income*taxRate)/100;
	double totalIncome=income-deduction-tax;
	
	incomeTaxCalculation.setIncometax(tax);
	incomeTaxCalculation.setIncomeAfterTax(totalIncome);
	return new IncomeTaxCalculation(101,taxRegime,incomeRange,income,deduction,incomeTaxCalculation.getIncometax(),incomeTaxCalculation.getIncomeAfterTax());
	
	
	}
	
	
}
