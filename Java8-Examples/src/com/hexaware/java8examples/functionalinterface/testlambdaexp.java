package com.hexaware.java8examples.functionalinterface;

import com.hexaware.java8examples.functionalinterfaceexample.Addition;

public class testlambdaexp {
	public static void main(String args[])
	{
		Message m = (name) -> {
			System.out.println("Name : "+name);
		
		};
		m.message("SAM");
	}
}
