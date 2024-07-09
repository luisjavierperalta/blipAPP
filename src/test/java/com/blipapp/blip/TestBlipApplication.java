package com.blipapp.blip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestBlipApplication {

	public static void main(String[] args) {
		SpringApplication.from(BlipApplication::main).with(TestBlipApplication.class).run(args);
	}

}
