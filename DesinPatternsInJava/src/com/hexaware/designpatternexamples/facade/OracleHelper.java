package com.hexaware.designpatternexamples.facade;

import java.sql.Connection;

public class OracleHelper {
	public static Connection getOracleDBConnection() {
		//write for connecting to Oracle DB using Oracle connection parameters
		System.out.println("Oracle DB Connected");
		return null;
	}
	
	public void generateOraclePDFReport(String tableName,Connection conn) {
		System.out.println(" PDF Generated");
		//get the data from the table and create a PDF report 
	}
	
	public void generateOracleHTMLReport(String tableName,Connection conn) {
		System.out.println("HTML Table Generated...");
		//get the data from the table and create a HTML report 
	}
}
