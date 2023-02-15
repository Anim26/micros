package com.incometax.calculation;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="income-tax-rate",url="localhost:8080")
public interface IncomeTaxCalculationProxy {
	
	
	@GetMapping(path="/income-tax-rate/Regime/{taxRegime}/incomeRange/{incomeRange}")
	
	public double retriveTaxRate(@PathVariable String taxRegime, @PathVariable String incomeRange);

}
