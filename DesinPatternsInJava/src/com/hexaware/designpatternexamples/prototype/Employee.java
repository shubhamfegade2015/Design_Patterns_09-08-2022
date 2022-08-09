package com.hexaware.designpatternexamples.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable{
	
	private List<String> empList;
	
	public Employee() {
		empList = new ArrayList<String>();
	}
	
	public Employee(List<String> eList) {
		this.empList = eList;
	}
	
	public void loadDataToList() {
		//read data from Database and we can add it into list
		empList.add("Pintu");
		empList.add("Raj");
		empList.add("Rama");
		empList.add("Krishna");
	}
	
	public List<String> getEmpList(){
		return empList;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> tempList= new ArrayList<String>();
		for(String s:this.getEmpList()) {
			tempList.add(s);
		}
		return new Employee(tempList);
	}
	

}
