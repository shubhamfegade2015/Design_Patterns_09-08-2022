package com.hexaware.crudoperationusingjava;

import java.util.List;
import java.util.Scanner;
//import java.util.stream.Collectors;

public class SearchSeller {
	
	public void searchSeller(List<Seller> list)
	{
		System.out.println("B)Search a seller by id(using map,foreach and filter)\n\n Give the ID : ");
		
		Scanner sc =new Scanner(System.in);
		int id1=sc.nextInt();
		
System.out.println("Using for each Method : ");
		
		list.stream().forEach((n)->{
			//boolean a=false;
			if(n.getId()==id1)
			{
				System.out.println("Element Found ");
				System.out.format("%15s %15s %15s %15s",n.getId(),n.getName(),n.getEmail(),n.getLocation()+"\n");
				
			}
			
		});
		
		//System.out.println("Using Filter Method : ");
		//List<Seller> l1=list.stream().filter(s -> s.getId()==id1).collect(Collectors.toList()));
		//l1.forEach((n) -> System.out.format("%15s %15s %15s %15s",n.getId(),n.getName(),n.getEmail(),n.getLocation()+"\n"));
		
		
	
	}

}
