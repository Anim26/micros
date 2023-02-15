package com.incometaxrate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/income-tax-rate")
public class IncomeTaxRateController {

	@Autowired
	private IncomeTaxRateRepository incomeTaxRateRepository;
	
	
	/*
	 * @GetMapping(path="Regime/{taxRegime}/Range/{incomeRange}") IncomeTaxRate
	 * getTaxRate(@PathVariable String taxRegime,@PathVariable String incomeRange) {
	 * IncomeTaxRate
	 * incomeTaxRate=incomeTaxRateRepository.findTaxRate(taxRegime,incomeRange);
	 * 
	 * return incomeTaxRate; }
	 */
	 
	
	@GetMapping(path="Regime/{taxRegime}/incomeRange/{incomeRange}")
	
	 public Double getByRegime(@PathVariable String taxRegime,@PathVariable String incomeRange ){
		 return incomeTaxRateRepository.findByRegime(taxRegime,incomeRange);
	}
}
