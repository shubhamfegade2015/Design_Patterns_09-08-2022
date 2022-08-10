package com.hexaware.java8examples.userdefinedfunctionalinterfaceexample;

import java.util.function.Predicate;

public class PredictInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> pre=(value) -> value>20;
		
		System.out.println(pre.test(35));

	}

}
