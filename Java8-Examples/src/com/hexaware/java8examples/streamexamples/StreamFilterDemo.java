package com.hexaware.java8examples.streamexamples;

import java.util.ArrayList;
import java.util.List;

public class StreamFilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listOfValues = new ArrayList<>();
		listOfValues.add(2);
		listOfValues.add(4);
		listOfValues.add(6);
		listOfValues.add(36);
		listOfValues.add(60);
		listOfValues.add(16);
		
		System.out.println("listing values greater than 15....");
		listOfValues.stream()  //created a stream from the array list
					.filter(num -> num > 15) //filter operation to ger values greater than 15
					.forEach(System.out::println);//printing each number in the list after filtering
	
	    /*Again printing the elements of list to show original
		list is not modified*/
		System.out.println("Original list is not modified....");
		listOfValues.stream()
					.forEach(System.out::println);
	}

}
