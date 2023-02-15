package com.incometaxrate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Income_Tax_Rate")
public class IncomeTaxRate {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String taxRegime;
	
	private String incomeRange;
	
	private double taxRate;

	@Override
	public String toString() {
		return "IncomeTaxRate [id=" + id + ", taxRegime=" + taxRegime + ", incomeRange=" + incomeRange + ", taxRate="
				+ taxRate + "]";
	}

	public IncomeTaxRate(Integer id, String taxRegime, String incomeRange, double taxRate) {
		super();
		this.id = id;
		this.taxRegime = taxRegime;
		this.incomeRange = incomeRange;
		this.taxRate = taxRate;
	}

	public IncomeTaxRate() {
		super();
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

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}
	

	
	

}
