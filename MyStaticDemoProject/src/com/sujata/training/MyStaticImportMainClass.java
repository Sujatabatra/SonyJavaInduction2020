package com.sujata.training;

//only used to import static member of the class so that we need not to specify class name while calling static members
import static com.sujata.demo.MyStaticDemoClass.*;

import com.sujata.demo.MyStaticDemoClass;

public class MyStaticImportMainClass {

	public static void main(String[] args) {
		second();
		
		fifth();
		
		fourth();
		
		MyStaticDemoClass ob=new MyStaticDemoClass();

	}

}
