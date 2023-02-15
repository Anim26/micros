package com.incometaxrate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/income-tax-rate")
public class IncomeTaxRateController {

	@Autowired
	private IncomeTaxRateRepository incomeTaxRateRepository;
	
	@Autowired
	private Environment environment;
	/*
	 * @GetMapping(path="Regime/{taxRegime}/Range/{incomeRange}") IncomeTaxRate
	 * getTaxRate(@PathVariable String taxRegime,@PathVariable String incomeRange) {
	 * IncomeTaxRate
	 * incomeTaxRate=incomeTaxRateRepository.findTaxRate(taxRegime,incomeRange);
	 * 
	 * return incomeTaxRate; }
	 */
	@GetMapping(path="Regime/{taxRegime}/incomeRange/{incomeRange}")
	
	 public IncomeTaxRate getByRegime(@PathVariable String taxRegime,@PathVariable String incomeRange ){
		 //List<IncomeTaxRate> incomeTaxRate=  incomeTaxRateRepository.findByRegime(taxRegime,incomeRange);
		IncomeTaxRate incomeTaxRate=  incomeTaxRateRepository.findByRegime(taxRegime,incomeRange); 
		String port = environment.getProperty("local.server.port");
		 incomeTaxRate.setEnv(port);
		 //return new IncomeTaxRate(101,"0L-2.5L","old",0,port) ;
		 return incomeTaxRate;
	}
}
