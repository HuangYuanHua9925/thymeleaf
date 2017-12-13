package com.test.www;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

@Configuration
public class RmiConfig {
	@Bean
	public RmiProxyFactoryBean teacherService() {
		RmiProxyFactoryBean rmiProxy = new RmiProxyFactoryBean();
		rmiProxy.setServiceUrl("rmi://127.0.0.1/teacherService");
		rmiProxy.setServiceInterface(TeacherService.class);
		return rmiProxy;
	}
}
