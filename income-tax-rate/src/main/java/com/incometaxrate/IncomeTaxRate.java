package com.incometaxrate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="Income_Tax_Rate")
public class IncomeTaxRate {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String taxRegime;
	
	private String incomeRange;
	
	private double taxRate;
	
	@Transient
	private String env;

	@Override
	public String toString() {
		return "IncomeTaxRate [id=" + id + ", taxRegime=" + taxRegime + ", incomeRange=" + incomeRange + ", taxRate="
				+ taxRate + ", env=" + env + "]";
	}


	public IncomeTaxRate(Integer id, String taxRegime, String incomeRange, double taxRate, String env) {
		super();
		this.id = id;
		this.taxRegime = taxRegime;
		this.incomeRange = incomeRange;
		this.taxRate = taxRate;
		this.env = env;
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

	public String getEnv() {
		return env;
	}

	public void setEnv(String env) {
		this.env = env;
	}
	
	
	

	
	

}
