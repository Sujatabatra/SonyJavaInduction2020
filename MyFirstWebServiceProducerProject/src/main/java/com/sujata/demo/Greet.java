package com.sujata.demo;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.DOCUMENT)
public interface Greet {
	
	@WebMethod
	public String wish(String name);
}
