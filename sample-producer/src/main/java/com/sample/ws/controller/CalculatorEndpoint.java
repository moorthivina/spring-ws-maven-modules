package com.sample.ws.controller;

import org.springframework.ws.server.endpoint.AbstractMarshallingPayloadEndpoint;

public class CalculatorEndpoint extends AbstractMarshallingPayloadEndpoint {

	@Override
	protected Object invokeInternal(Object object) throws Exception {
		System.out.println(object.getClass().getCanonicalName());
		return null;
	}

}
