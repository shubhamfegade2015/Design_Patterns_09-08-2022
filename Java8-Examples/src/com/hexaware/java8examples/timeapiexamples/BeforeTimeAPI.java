package com.hexaware.java8examples.timeapiexamples;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;



public class BeforeTimeAPI {
	public static void main(String[] args) {
		Date today = new Date();
		System.out.println("Today date is : " + today.toString());

		//@SuppressWarnings("deprecation")
		Calendar independenceDay = new GregorianCalendar(1947,7,15);
		System.out.println("Independence day of Bharath : " + independenceDay.getTime());
		
		//display date in dd/MM/yyyy
		DateFormat ddMMyyFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("DateFormat is not ThreadSafe =" + ddMMyyFormat.format(today));
		
	}

}
