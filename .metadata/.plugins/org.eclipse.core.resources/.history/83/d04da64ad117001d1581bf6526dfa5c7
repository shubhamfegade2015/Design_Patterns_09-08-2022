package com.hexaware.designpatternexamples.facade;

import java.sql.Connection;

public class FacadePatternTest {

	public static void main(String[] args) {
		String tableName = "Employee";
	
		//generating MYSQL HTML Report and Oracle PDF report with out using Facade
		Connection con = MySqlHelper.getMySqlDBConnection();
		MySqlHelper mySqlHelper = new MySqlHelper();
		mySqlHelper.generateMySqlHTMLReport(tableName, con);

		
		Connection con1 = OracleHelper.getOracleDBConnection();
		OracleHelper oracleHelper = new OracleHelper();
		oracleHelper.generateOracleHTMLReport(tableName, con1);
		
		//generating MYSQL HTML Report and Oracle PDF report using Facade
		HelperFacade.generateReport(DBTypes.MYSQL, ReportTypes.HTML, tableName);
		HelperFacade.generateReport(DBTypes.ORACLE, ReportTypes.PDF, tableName);
	}

}
