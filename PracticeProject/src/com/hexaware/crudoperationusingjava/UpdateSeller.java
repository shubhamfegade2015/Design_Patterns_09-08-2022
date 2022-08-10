package com.hexaware.crudoperationusingjava;

import java.util.List;
import java.util.Scanner;

public class UpdateSeller {
	
	
	public void updateSeller(List<Seller> list)
	{
		System.out.println("D)Update a seller by id and display the list after update using foreach : ");
		Scanner sc =new Scanner(System.in);
		int id1=sc.nextInt();
		
		
		list.forEach((n)->{
			if(n.getId()==id1)
			{
				System.out.println("Element Found  ");
				//System.out.print("Give New Name : ");
				String name1=sc.nextLine();
				//n.setName(name1);
				System.out.print("Give New Email : ");
				String email=sc.nextLine();
				n.setEmail(email);
				System.out.println("Give New Location : ");
				String location=sc.nextLine();
				n.setLocation(location);
				
			}
		});
		
		System.out.println("Displaying the Seller list after updating the seller : \n");
		DisplaySeller ds=new DisplaySeller();
		ds.displaySeller(list);

	}

}
