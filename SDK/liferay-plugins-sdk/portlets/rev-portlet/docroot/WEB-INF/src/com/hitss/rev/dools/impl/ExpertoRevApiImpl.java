package com.hitss.rev.dools.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hitss.rev.dools.ExpertoRevApi;

@Component("ExpertoRevApi")
public class ExpertoRevApiImpl implements ExpertoRevApi {

	@Autowired
	private OrderTest orderTest;

	@Override
	public void test() {
		orderTest.test();
	}
	
	
	 
	

}
