package com.hexaware.crudoperationusingjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SellerCrudOperation {
	
	public static void main(String...args)
	{
		List<Seller> list = new ArrayList<>();
		//Adding Seller into the arraylist of objects;
		Seller s1= new Seller(1,"Niraj","niraj@gmail.com","Chennai");
		Seller s2= new Seller(2,"Shubham","shubham@gmail.com","Chennai");
		Seller s3= new Seller(3,"Swapnil","swapnil@gmail.com","Chennai");
		Seller s4= new Seller(4,"Nikhil","nikhil@gmail.com","Mumbai");
		Seller s5= new Seller(5,"Kunal","kunal@gmail.com","Nashik");
		Seller s6= new Seller(6,"Akash","Akash@gmail.com","Pune");
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		
		System.out.println("A) Displaying the Seller using for each \n");
		DisplaySeller ds=new DisplaySeller();
		ds.displaySeller(list);
		
		SearchSeller ss=new SearchSeller();
		ss.searchSeller(list);
		
		DeleteSeller d = new DeleteSeller();
		d.deleteSeller(list);
		
		UpdateSeller u=new UpdateSeller();
		u.updateSeller(list);
		
		System.out.println("E) Display All Sellers whose location is Chennai : ");
		list.stream().forEach((n)->{ 
			if(n.getLocation().equalsIgnoreCase("chennai"))
			{
				System.out.format("%15s %15s %15s %15s",n.getId(),n.getName(),n.getEmail(),n.getLocation()+"\n");
			}
			});
	}
	
	
	
	
}
