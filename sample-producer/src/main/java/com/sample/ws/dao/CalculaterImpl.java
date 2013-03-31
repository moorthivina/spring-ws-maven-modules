package com.sample.ws.dao;

import org.springframework.stereotype.Component;

@Component
public class CalculaterImpl implements Calculater {

	public int add(int a, int b) {
		return a+b;
	}

}
