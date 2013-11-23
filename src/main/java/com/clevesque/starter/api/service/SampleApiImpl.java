package com.clevesque.starter.api.service;

import org.springframework.stereotype.Service;

import com.clevesque.starter.api.vo.HelloWS;

@Service("sampleApi")
public class SampleApiImpl implements SampleApi {
	@Override
	public HelloWS sayHello(String name) {
		return new HelloWS(name);
	}
}
