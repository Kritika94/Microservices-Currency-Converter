package com.in28Minutes.microservices.currencyconversionservice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {
	Logger logger=LoggerFactory.getLogger(this.getClass()); 
	@Autowired
	private CurrencyExchangeServiceProxy proxy;
	@GetMapping("currencyconversion/from/{from}/to/{to}/quantity/{quantity}")
	public currencyconversion convertedcurrency(@PathVariable String from, @PathVariable String to
			,@PathVariable BigDecimal quantity
			) {

		//feign problem1
		Map<String , String> uriVariables=new HashMap<>();
		uriVariables.put("from",from);
		uriVariables.put("to",to);

		ResponseEntity<currencyconversion>response =new RestTemplate().
				getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", currencyconversion.class,uriVariables);
		System.err.println("response is"+ response);
		currencyconversion bean=response.getBody();
		System.err.println("response is"+ response.getBody());
		return new currencyconversion
				(bean.getId(),from,to,bean.getConversionMultiple(),quantity,quantity.multiply(bean.getConversionMultiple()),bean.getPort());
	}


	@GetMapping("currencyconversionfeign/from/{from}/to/{to}/quantity/{quantity}")
	public currencyconversion convertedcurrencyfeign(@PathVariable String from, @PathVariable String to
			,@PathVariable BigDecimal quantity
			) {

		currencyconversion bean=proxy.retrieveExchangeValue(from, to);
		logger.info("{}",bean);

		return new currencyconversion
				(bean.getId(),from,to,bean.getConversionMultiple(),quantity,quantity.multiply(bean.getConversionMultiple()),bean.getPort());



	}


}
