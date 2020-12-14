package com.sujata.client;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.sujata.demo.Employee;

public class XMLToObject {

	public static void main(String[] args) throws JAXBException {
		File file=new File("employee.xml");
		
		JAXBContext jaxbContext=JAXBContext.newInstance(Employee.class);
		
		Unmarshaller unmarshallerObj=jaxbContext.createUnmarshaller();
		
		Employee emp=(Employee)unmarshallerObj.unmarshal(file);
		System.out.println(emp);

	}

}
