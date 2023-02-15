package com.incometax.calculation;

import org.springframework.stereotype.Component;

@Component
public class IncomeTaxCalculation {
	
	private Integer id;
	
	private String taxRegime;
	
	private String incomeRange;
	
	private double income;
	
	private double deduction;
	
	private double incometax;
	
	private double incomeAfterTax;

	@Override
	public String toString() {
		return "IncomeTaxCalculation [id=" + id + ", taxRegime=" + taxRegime + ", incomeRange=" + incomeRange
				+ ", income=" + income + ", deduction=" + deduction + ", incometax=" + incometax + ", incomeAfterTax="
				+ incomeAfterTax + "]";
	}

	public IncomeTaxCalculation() {
		super();
	}

	public IncomeTaxCalculation(Integer id, String taxRegime, String incomeRange, double income, double deduction,
			double incometax, double incomeAfterTax) {
		super();
		this.id = id;
		this.taxRegime = taxRegime;
		this.incomeRange = incomeRange;
		this.income = income;
		this.deduction = deduction;
		this.incometax = incometax;
		this.incomeAfterTax = incomeAfterTax;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTaxRegime() {
		return taxRegime;
	}

	public void setTaxRegime(String taxRegime) {
		this.taxRegime = taxRegime;
	}

	public String getIncomeRange() {
		return incomeRange;
	}

	public void setIncomeRange(String incomeRange) {
		this.incomeRange = incomeRange;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public double getDeduction() {
		return deduction;
	}

	public void setDeduction(double deduction) {
		this.deduction = deduction;
	}

	public double getIncometax() {
		return incometax;
	}

	public void setIncometax(double incometax) {
		this.incometax = incometax;
	}

	public double getIncomeAfterTax() {
		return incomeAfterTax;
	}

	public void setIncomeAfterTax(double incomeAfterTax) {
		this.incomeAfterTax = incomeAfterTax;
	}
	
	
	
	

}
