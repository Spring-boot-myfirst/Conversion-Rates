package com.currency.hq.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CurrencyEntity {
	
	public CurrencyEntity() {
	}
	public CurrencyEntity(Integer id, String currency_from, String currency_to, BigDecimal conversionRate) {
		super();
		this.id = id;
		this.currencyfrom = currency_from;
		this.currencyto = currency_to;
		this.conversionRate = conversionRate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCurrencyfrom() {
		return currencyfrom;
	}
	public void setCurrencyfrom(String currency_from) {
		this.currencyfrom = currency_from;
	}
	public String getCurrencyto() {
		return currencyto;
	}
	public void setCurrencyto(String currency_to) {
		this.currencyto = currency_to;
	}
	public BigDecimal getConversionRate() {
		return conversionRate;
	}
	public void setConversionRate(BigDecimal conversionRate) {
		this.conversionRate = conversionRate;
	}
	
	@Id
	private Integer id;
	private String currencyfrom;
	private String currencyto;
	private BigDecimal conversionRate;

}
