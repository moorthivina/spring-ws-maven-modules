package com.sample.ws.controller;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.Marshaller;
import org.springframework.ws.server.endpoint.AbstractMarshallingPayloadEndpoint;

import com.sample.ws.dao.Calculater;
import com.sample.ws.xsd.AddRequest;
import com.sample.ws.xsd.AddResponse;

public class CalculatorEndpoint extends AbstractMarshallingPayloadEndpoint {
	
	@Autowired
	private Calculater calculater;

	public CalculatorEndpoint(Marshaller marshaller) {
		super(marshaller);
	}

	@Override
	protected Object invokeInternal(Object object) throws Exception {
		System.out.println(object.getClass().getSimpleName());
		if("AddRequest".equalsIgnoreCase(object.getClass().getSimpleName())) {
			return add((AddRequest) object);
		}
		return null;
	}

	private AddResponse add(AddRequest req) {
		AddResponse res = new AddResponse();
		res.setNumber1(BigInteger.valueOf(calculater.add(req.getNumber1().intValue(), req.getNumber2().intValue())));
		return res;
	}
}
