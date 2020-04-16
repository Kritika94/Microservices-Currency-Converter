package com.in28Minutes.microservices.limitsservice.bean;

import org.springframework.stereotype.Component;

@Component
public class LimitConfigeration {
private int minimum;
private int maximum;
public int getMinimum() {
	return minimum;
}
public void setMinimum(int minimum) {
	this.minimum = minimum;
}
public int getMaximum() {
	return maximum;
}
public void setMaximum(int maximum) {
	this.maximum = maximum;
}
protected LimitConfigeration() {
	super();
	// TODO Auto-generated constructor stub
}
public LimitConfigeration(int minimum, int maximum) {
	super();
	this.minimum = minimum;
	this.maximum = maximum;
}

}