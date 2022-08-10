package com.hexaware.java8examples.timeapiexamples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Java8DateAPI {

	public static void main(String[] args) {
		LocalDate currLocalDate = LocalDate.now();
		System.out.println("Current Local Date = yyyy-MM-dd - " + currLocalDate);
		
		LocalDate independenceDay = LocalDate.of(1947,7,15);
		System.out.println("Independence day of Bharath : - " + independenceDay);
		
		LocalDate republicDay = LocalDate.of(01,01,01);
		republicDay = republicDay.withYear(1950).withMonth(1).withDayOfMonth(26);
		System.out.println("Republic Day of Bharath : - " + republicDay);
		
		LocalDate lockDownInIndia = LocalDate.parse("2020-03-24",DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		System.out.println("LockDown In India : - " + lockDownInIndia);
		
		String lockDownInIndia1 = DateTimeFormatter.ofPattern("dd/MM/yyyy",Locale.ENGLISH).format(lockDownInIndia);
		System.out.println("LockDown In India : - " + lockDownInIndia1);
		
		LocalTime currentLocalTime = LocalTime.now();
		System.out.println("current Local time = " + currentLocalTime);
		
		LocalTime lunchTime = LocalTime.parse("13:15");
		System.out.println("Lunch Time = " + lunchTime);
		
		LocalTime lunchTime1 = LocalTime.parse("13:15:05");
		System.out.println("Lunch Time = " + lunchTime1);
		
		LocalDateTime curLocalDateTime = LocalDateTime.now();
		System.out.println("current Local Date and Time = " + curLocalDateTime);
		
		LocalDateTime lunchDateTime = LocalDateTime.parse("2022-08-10T13:15:05");
		System.out.println("Lunch Date and Time = " + lunchDateTime);
		
		ZonedDateTime zonedDateTime = ZonedDateTime.of(curLocalDateTime, ZoneId.systemDefault());
		System.out.println("current Local Date and Time with Zone Id = " + zonedDateTime);
		
		ZoneId australiaZoneId = ZoneId.of("Australia/Sydney");
		ZonedDateTime zonedDateTime_Aus = ZonedDateTime.of(curLocalDateTime,australiaZoneId);
		System.out.println("Australia Date and Time with Zone Id = " + zonedDateTime_Aus);
		
		ZoneId parisZoneId = ZoneId.of("Europe/Paris");
		ZonedDateTime zonedDateTime_Paris = ZonedDateTime.of(curLocalDateTime,parisZoneId);
		System.out.println("Paris Date and Time with Zone Id = " + zonedDateTime_Paris);
		
		Period bonusPeriod = Period.of(75, 01, 00);
		System.out.println("bonus period = "+ bonusPeriod);
		
		LocalDate currentIndependenceDay = independenceDay.plus(bonusPeriod);
		System.out.println("Current Independence Day =" + currentIndependenceDay);
		
		Period period = Period.of(00, 00, 05);
		System.out.println("bonus period = "+ period);
		
		LocalDate currentIndependenceDay1 = LocalDate.now().plus(period);
		System.out.println("Current Independence Day =" + currentIndependenceDay1);
		
		Period republicPeriod = Period.of(00, 05, 16);
		System.out.println("bonus period = "+ republicPeriod);
		
		LocalDate currentRepublicDay = LocalDate.now().plus(republicPeriod);
		System.out.println("Current Republic Day =" + currentRepublicDay);
	}
	
}
