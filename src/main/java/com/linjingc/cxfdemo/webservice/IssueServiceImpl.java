package com.linjingc.cxfdemo.webservice;


import org.springframework.stereotype.Component;

import javax.jws.WebService;

@WebService(serviceName  = "IssueService",//与前面接口一致
		targetNamespace = "http://www.webservice.cxfdemo.linjingc.com",  //与前面接口一致
		endpointInterface = "com.linjingc.cxfdemo.webservice.IssueService")  //接口地址
@Component
public class IssueServiceImpl implements IssueService {

	@Override
	public String hello(String name) {

		return "hello World!!->"+name;
	}
}
