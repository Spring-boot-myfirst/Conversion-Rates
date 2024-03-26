package com.currency.hq.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.currency.hq.entity.CurrencyEntity;
import com.currency.hq.service.CurrencyService;
@RestController
public class CurrencyController {
	
	
	@Autowired
	private CurrencyService service;
	
	
	@GetMapping("/currency-rate/from/{from}/to/{to}")
	public CurrencyEntity convertCurrency(@PathVariable("from") String from, @PathVariable("to") String to) {
			return service.convertCurrency(from, to);
	}

}
