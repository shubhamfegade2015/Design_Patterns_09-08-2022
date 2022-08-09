package com.hexaware.designpatternexamples.prototype;

import java.util.List;

public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		 Employee emps = new Employee();
		 emps.loadDataToList();
		 
		 //use the clone method to get employee object
		 Employee empNew = (Employee) emps.clone();
		 Employee empNew1 = (Employee) emps.clone();
		 Employee empNew2 = (Employee) emps.clone();
		 
		 List<String> list = empNew.getEmpList();
		 list.add("Joe");
		 
		 List<String> list1 = empNew1.getEmpList();
		 list1.add("Abraham");
		 
		 List<String> list11 = empNew2.getEmpList();
		 list11.add("Abhi");
		 
		 System.out.println("emps list = "+emps.getEmpList());
		 System.out.println("empNew list = " + list);
		 System.out.println("empNew1 list = " + list1);
		 System.out.println("empNew2 list = " + list11);
	}

}
