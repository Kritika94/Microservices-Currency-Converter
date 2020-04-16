package com.in28Minutes.microservices.currencyconversionservice;

import java.math.BigDecimal;

public class currencyconversion {
private Long id;
private String from;
private String to;
private BigDecimal conversionMultiple;
private BigDecimal quantity;
private BigDecimal totalCalculatedvalue;
private int port;
public currencyconversion() {
	// TODO Auto-generated constructor stub
}
currencyconversion(Long id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity,
		BigDecimal totalCalculatedvalue, int port) {
	super();
	this.id = id;
	this.from = from;
	this.to = to;
	this.conversionMultiple = conversionMultiple;
	this.quantity = quantity;
	this.totalCalculatedvalue = totalCalculatedvalue;
	this.port = port;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getFrom() {
	return from;
}
public void setFrom(String from) {
	this.from = from;
}
public String getTo() {
	return to;
}
public void setTo(String to) {
	this.to = to;
}
public BigDecimal getConversionMultiple() {
	return conversionMultiple;
}
public void setConversionMultiple(BigDecimal conversionMultiple) {
	this.conversionMultiple = conversionMultiple;
}
public BigDecimal getQuantity() {
	return quantity;
}
public void setQuantity(BigDecimal quantity) {
	this.quantity = quantity;
}
public BigDecimal getTotalCalculatedvalue() {
	return totalCalculatedvalue;
}
public void setTotalCalculatedvalue(BigDecimal totalCalculatedvalue) {
	this.totalCalculatedvalue = totalCalculatedvalue;
}
public int getPort() {
	return port;
}
public void setPort(int port) {
	this.port = port;
}
	
	
	
}
