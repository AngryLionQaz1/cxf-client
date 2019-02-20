package com.snow.cxfclient;



import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;


@WebService
public interface UserService {

	@WebMethod//标注该方法为webservice暴露的方法,用于向外公布，它修饰的方法是webservice方法，去掉也没影响的，类似一个注释信息。
	 User getUser(@WebParam(name = "userId") String userId);
	
	@WebMethod//(exclude=true)该犯法不暴露，静态方法和final方法不暴露
	@WebResult(name="String",targetNamespace="")
	String getUserName(@WebParam(name = "userId") String userId);
	
}
