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
	        CurrencyEntity conversionEntity = repo.findByCurrencyfromAndCurrencyto(from, to);

	        if (conversionEntity == null || conversionEntity.getConversionRate() == null) {

	        	throw new RuntimeException("Conversion data not found for provided currencies");
	        }
	        
	        
	        
	        return conversionEntity;
	    } catch (Exception e) {
	    	 throw new RuntimeException("Error converting currency", e);
	    }
	}

}
