package com.test.www;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

@Configuration
public class HttpInvokerConfig {
	@Bean
	public HttpInvokerProxyFactoryBean examinationsMapper() {
		HttpInvokerProxyFactoryBean proxy = new HttpInvokerProxyFactoryBean();
		proxy.setServiceUrl("http://127.0.0.1:8088/SpringMyBatis/httpInvokerService");
		proxy.setServiceInterface(ExaminationsMapper.class);
		return proxy;
	}
}
