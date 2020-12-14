package com.sujata.client;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.sujata.demo.Employee;

public class ObjectToXML {

	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		JAXBContext contextObj=JAXBContext.newInstance(Employee.class);
		
		Marshaller marshallerObj=contextObj.createMarshaller();
		marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		Employee emp=new Employee(101, "Akanksha", "Executive", "Sales", 12345);
		marshallerObj.marshal(emp, new FileOutputStream("employee.xml"));
		System.out.println("Process Completed");
	}

}
