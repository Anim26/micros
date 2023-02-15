package com.incometaxrate;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



import jakarta.persistence.Id;

@Repository
public interface IncomeTaxRateRepository extends JpaRepository<IncomeTaxRate, Integer> {
	
	 //IncomeTaxRate findTaxRate(String taxRegime,String incomeRange);

		@Query("SELECT c FROM IncomeTaxRate c WHERE c.taxRegime=:taxRegime and c.incomeRange=:incomeRange")
		 //public List<IncomeTaxRate> findByRegime(@Param("taxRegime") String taxRegime,@Param("incomeRange") String incomeRange);
		IncomeTaxRate findByRegime(@Param("taxRegime") String taxRegime,@Param("incomeRange") String incomeRange); 
}
