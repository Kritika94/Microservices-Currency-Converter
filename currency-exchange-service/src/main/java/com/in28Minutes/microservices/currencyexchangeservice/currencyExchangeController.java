package com.in28Minutes.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class currencyExchangeController {
	@Autowired
	private exchangeValueRepository repos;
	Logger logger=LoggerFactory.getLogger(this.getClass()); 
	
	@Autowired
	private Environment env;
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
public ExchangeValue retrieveExchangeValue(@PathVariable String from ,@PathVariable String to) {
	//	ExchangeValue exchange=new ExchangeValue(1000L,from,to,BigDecimal.valueOf(65));
	ExchangeValue exchange=repos.findByFromAndTo(from, to);
		exchange.setPort(Integer.parseInt
				(env.getProperty("local.server.port")));
logger.info("{}",exchange);
		
		return exchange;
	}
}
