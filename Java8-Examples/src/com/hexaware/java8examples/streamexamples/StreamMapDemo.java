package com.hexaware.java8examples.streamexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listOfNames = new ArrayList<>();
		listOfNames.add("Dev");
		listOfNames.add("Dave");
		listOfNames.add("Donald");
		listOfNames.add("Javed");
		listOfNames.add("Jin");
		listOfNames.add("Prem");
		
		//System.out.println("list of names after converting in to lower case....");
		//using map() method we can convert each name to uppercase
		//Note : map() method does not modify the original list
		List<String> names = listOfNames.stream()
					.map(name -> name.toLowerCase())//map() takes an input of Function<T,R> type
					.filter(name -> name.startsWith("j")) //filter() method filters the data based on condition specified
					.collect(Collectors.toList());//collects the output of map method in to a list
					
		//print collected names in a list using foreach
		System.out.println("list of names from a new list after applying terminal operation on exisiting list....");
		names.stream()
		.forEach(System.out::println);
	

	    /*Again printing the elements of list to show original
		list is not modified*/
		System.out.println("Original list is not modified....");
		listOfNames.stream()
					.forEach(System.out::println);

	}

}
