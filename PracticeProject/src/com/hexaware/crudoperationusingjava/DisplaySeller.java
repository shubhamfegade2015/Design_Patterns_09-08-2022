package com.hexaware.crudoperationusingjava;

import java.util.List;

public class DisplaySeller {

	public void displaySeller(List<Seller> list)
	{
		
		System.out.printf("%15s %15s %15s %15s","ID","Name","Email","Location");
		System.out.println();
		list.forEach((n) -> System.out.format("%15s %15s %15s %15s",n.getId(),n.getName(),n.getEmail(),n.getLocation()+"\n"));
	}
	
}
