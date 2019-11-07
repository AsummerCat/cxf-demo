package com.linjingc.cxfdemo.config;

import com.linjingc.cxfdemo.webservice.IssueService;
import org.apache.cxf.Bus;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * 配置cxf服务发布,默认服务在Host:port/services/***路径下：
 */
@Configuration
public class WebConfig {
	@Autowired
	private Bus bus;

	@Autowired
	IssueService service;

	/*jax-ws*/
	@Bean
	public Endpoint endpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, service);
		endpoint.publish("/IssueService");
		//添加校验拦截器
		endpoint.getInInterceptors().add(new AuthInterceptor());
		return endpoint;
	}
}