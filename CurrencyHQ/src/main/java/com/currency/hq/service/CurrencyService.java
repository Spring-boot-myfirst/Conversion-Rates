package com.currency.hq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.currency.hq.entity.CurrencyEntity;
import com.currency.hq.repository.CurrencyRepository;

@Service
public class CurrencyService {
	
	
	@Autowired
	CurrencyRepository repo;
	
	public CurrencyEntity convertCurrency(String from,String to) {
		try {
	        // Retrieve the conversion rate from the repository
	        CurrencyEntity conversionEntity = repo.findByCurrencyfromAndCurrencyto(from, to);

	        // Check if conversionEntity is null or conversionMultiple is null to handle the case where conversion data is not found
	        if (conversionEntity == null || conversionEntity.getConversionRate() == null) {
	            // You may throw an exception or return a default value based on your requirement
	            throw new RuntimeException("Conversion data not found for provided currencies");
	        }
	        
	        
	        
	        return conversionEntity;
	    } catch (Exception e) {
	    	 throw new RuntimeException("Error converting currency", e);
	    }
	}

}
