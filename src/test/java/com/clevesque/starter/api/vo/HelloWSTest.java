package com.clevesque.starter.api.vo;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class HelloWSTest {
	private static final String CHRISTOPHE = "Christophe";

	@Test
	public void testName() {
		HelloWS hello = new HelloWS(CHRISTOPHE);
		assertThat(hello.getName()).isEqualTo(CHRISTOPHE);
	}
}
