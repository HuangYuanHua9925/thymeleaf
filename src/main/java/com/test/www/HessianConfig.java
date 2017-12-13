package com.test.www;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

@Configuration
public class HessianConfig {
	@Bean
	public HessianProxyFactoryBean examineeMapper() {
		HessianProxyFactoryBean proxy = new HessianProxyFactoryBean();
		proxy.setServiceUrl("http://127.0.0.1:8088/SpringMyBatis/hessian.service");
		proxy.setServiceInterface(ExamineeMapper.class);
		return proxy;
	}
}
