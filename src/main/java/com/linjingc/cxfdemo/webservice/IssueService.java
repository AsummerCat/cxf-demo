package com.linjingc.cxfdemo.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @author cxc
 * WebService接口 发布
 */
@WebService(name = "IssueService", //暴露服务名称
		targetNamespace = "http://www.webservice.cxfdemo.linjingc.com") //命名空间,一般是接口名称倒序
public interface IssueService {

	@WebMethod
	@WebResult(name = "String", targetNamespace = "")
	public String hello(@WebParam(name = "helloName") String name);
}
