package com.test.www.jaxws;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;

import com.yuan.www.service.SpitterService;

@Configuration
public class JaxWsConfig {
	@Bean
	public JaxWsPortProxyFactoryBean spitterService()
			throws MalformedURLException {
		JaxWsPortProxyFactoryBean proxy = new JaxWsPortProxyFactoryBean();
		proxy.setWsdlDocumentUrl(new URL(
				"http://127.0.0.1:8080/services/SpitterService?wsdl"));
		proxy.setPortName("SpitterServiceEndpointPort");
		proxy.setServiceName("SpitterService");
		// 该接口上需要注解@WebService
		proxy.setServiceInterface(SpitterService.class);
		// namespaceUri代表着serviceInterFace的包名
		proxy.setNamespaceUri("http://service.www.yuan.com/");
		return proxy;

	}
}
