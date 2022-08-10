package com.hexaware.crudoperationusingjava;

import java.util.List;
import java.util.Scanner;

public class DeleteSeller {
		
	public void deleteSeller(List<Seller> list)
	{
		System.out.println("C)delete a seller by id and display the list using foreach : ");
		Scanner sc =new Scanner(System.in);
		int id1=sc.nextInt();
		
		list.removeIf(p -> p.getId()==id1);
		
		System.out.println("Displaying the Seller list after deleting element : \n");
		DisplaySeller ds=new DisplaySeller();
		ds.displaySeller(list);
		
	}
	
}
