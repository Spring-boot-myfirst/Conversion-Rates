package com.currency.hq.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.currency.hq.entity.CurrencyEntity;


public interface CurrencyRepository extends JpaRepository<CurrencyEntity, Integer>{
	CurrencyEntity findByCurrencyfromAndCurrencyto(String currency_from, String currency_to);

}
