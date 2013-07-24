package com.resultech.support;

import jxl.CellType;
import jxl.Workbook;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.write.*;

import javax.swing.*;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Logger;

//import com.qsg.demo.tcr.AddTestCase;

/**
 * <font face="courier" size="2">This Class includes all common functions
 * related to Office application</font>
 * 
 * @author <font face="courier" size="2">QSG</font>
 * @version <font face="courier" size="2">1.0</font>
 */


public class OfficeCommonFunctions {
	public Properties EnvDetails;
	static Logger log4j = Logger.getLogger("com.qsgsoft.EM.Triptix.OfficeCommonFunctions");
	// private static final String FILE_PATH = "C:/Beezag/Beezag_Results/";
	private static WritableCellFormat courier;

	/**
	 * This function is used to write data into the Excel file
	 * 
	 * @throws Exception
	 */
	public void WriteResult(String strTCId, String strTO, String strResult,
			String strReason, double dbTimeTaken, String strRunOn)
			throws Exception {


        String  FILE_PATH = "d:\\Result.xls";
		// Read the existing file
		Workbook wb = Workbook.getWorkbook(new File(FILE_PATH));

		// Create a writable workbook with the same name using the workbook
		// object that has been read from file
		WritableWorkbook wwb = Workbook.createWorkbook(new File(FILE_PATH), wb);

		// Total number of rows in the sheet
		int intRowCount = wwb.getSheet(0).getRows();
		for (int intRow = 4; intRow <= intRowCount; intRow++) {
			// Target cell
			WritableCell cell = wwb.getSheet(0).getWritableCell(1, intRow);

			if (cell.getType() == CellType.EMPTY) {
				WritableCellFormat wcf = new WritableCellFormat();
				wcf.setBorder(Border.ALL, BorderLineStyle.THIN);
				wcf.setWrap(true);

				WritableFont courier10pt = new WritableFont(
						WritableFont.COURIER, 10);
				// Define the cell format
				courier = new WritableCellFormat(courier10pt);
				wcf.setFont(courier10pt);

				// Enter the TC ID
				Label label1 = new Label(1, intRow, strTCId, wcf);
				wwb.getSheet(0).addCell(label1);
				// Enter Test Objective
				Label label2 = new Label(2, intRow, strTO, wcf);
				wwb.getSheet(0).addCell(label2);
				// Enter Result
				Label label3 = new Label(3, intRow, strResult, wcf);
				wwb.getSheet(0).addCell(label3);
				// Enter Reason
				Label label4 = new Label(4, intRow, strReason, wcf);
				wwb.getSheet(0).addCell(label4);
				// Enter Time taken
				String strTime = String.valueOf(dbTimeTaken);
				Label label5 = new Label(5, intRow, strTime, wcf);
				wwb.getSheet(0).addCell(label5);

				String strRes = RunON();
				Label label6 = new Label(6, intRow, strRes, wcf);
				wwb.getSheet(0).addCell(label6);
				// Write the data
				wwb.write();
				intRow = intRowCount + 1;
			}
		}
		wwb.close();
	}

	public void WriteResult(String strTCId, String strTO, String strResult,
			String strReason, double dbTimeTaken, String FILE_PATH,
			String strRunOn) throws Exception {

		// Read the existing file
		Workbook wb = Workbook.getWorkbook(new File(FILE_PATH));

		// Create a writable workbook with the same name using the workbook
		// object that has been read from file
		WritableWorkbook wwb = Workbook.createWorkbook(new File(FILE_PATH), wb);

		// Total number of rows in the sheet
		int intRowCount = wwb.getSheet(0).getRows();
		for (int intRow = 4; intRow <= intRowCount; intRow++) {
			// Target cell
			WritableCell cell = wwb.getSheet(0).getWritableCell(1, intRow);

			if (cell.getType() == CellType.EMPTY) {
				WritableCellFormat wcf = new WritableCellFormat();
				wcf.setBorder(Border.ALL, BorderLineStyle.THIN);
				wcf.setWrap(true);

				WritableFont courier10pt = new WritableFont(
						WritableFont.COURIER, 10);
				// Define the cell format
				courier = new WritableCellFormat(courier10pt);
				wcf.setFont(courier10pt);

				// Enter the TC ID
				Label label1 = new Label(1, intRow, strTCId, wcf);
				wwb.getSheet(0).addCell(label1);
				// Enter Test Objective
				Label label2 = new Label(2, intRow, strTO, wcf);
				wwb.getSheet(0).addCell(label2);
				// Enter Result
				Label label3 = new Label(3, intRow, strResult, wcf);
				wwb.getSheet(0).addCell(label3);
				// Enter Reason
				Label label4 = new Label(4, intRow, strReason, wcf);
				wwb.getSheet(0).addCell(label4);
				// Enter Time taken
				String strTime = String.valueOf(dbTimeTaken);
				Label label5 = new Label(5, intRow, strTime, wcf);
				wwb.getSheet(0).addCell(label5);

				String strRes = RunON();
				Label label6 = new Label(6, intRow, strRes, wcf);
				wwb.getSheet(0).addCell(label6);
				//Write the data
				wwb.write();
				intRow = intRowCount + 1;
			}
		}
		wwb.close();
	}

	/*public void WriteResultdb_Excel(String strTCId, String strTO, String strResult,
			String strReason, double dbTimeTaken, String FILE_PATH,
			boolean blnwrite, String strstarttime, String strDate,long lDateTime,
			String strbrowser, String strversion,String StrSessionId) throws Exception {
		String strtimetaken=Double.toString(dbTimeTaken);
		ReadEnvironment objReadEnvironment = new ReadEnvironment();
		EnvDetails = objReadEnvironment.ReadEnvironment();
		if(blnwrite==true){
		
		// Read the existing file
		Workbook wb = Workbook.getWorkbook(new File(FILE_PATH));

		// Create a writable workbook with the same name using the workbook
		// object that has been read from file
		WritableWorkbook wwb = Workbook.createWorkbook(new File(FILE_PATH), wb);

		// Total number of rows in the sheet
		int intRowCount = wwb.getSheet(0).getRows();
		for (int intRow = 4; intRow <= intRowCount; intRow++) {
			// Target cell
			WritableCell cell = wwb.getSheet(0).getWritableCell(1, intRow);

			if (cell.getType() == CellType.EMPTY) {
				WritableCellFormat wcf = new WritableCellFormat();
				wcf.setBorder(Border.ALL, BorderLineStyle.THIN);
				wcf.setWrap(true);

				WritableFont courier10pt = new WritableFont(
						WritableFont.COURIER, 10);
				// Define the cell format
				courier = new WritableCellFormat(courier10pt);
				wcf.setFont(courier10pt);

				// Enter the TC ID
				Label label1 = new Label(1, intRow, strTCId, wcf);
				wwb.getSheet(0).addCell(label1);
				// Enter Test Objective
				Label label2 = new Label(2, intRow, strTO, wcf);
				wwb.getSheet(0).addCell(label2);
				// Enter Result
				Label label3 = new Label(3, intRow, strResult, wcf);
				wwb.getSheet(0).addCell(label3);
				// Enter Reason
				Label label4 = new Label(4, intRow, strReason, wcf);
				wwb.getSheet(0).addCell(label4);
				// Enter Time taken
				String strTime = String.valueOf(dbTimeTaken);
				Label label5 = new Label(5, intRow, strTime, wcf);
				wwb.getSheet(0).addCell(label5);

				String strRes = RunON();
				Label label6 = new Label(6, intRow, strRes, wcf);
				wwb.getSheet(0).addCell(label6);
				// Write the data
				wwb.write();
				intRow = intRowCount + 1;
			}
		}
		wwb.close();
		}else{
			HashMap<String, String> hm = new HashMap<String, String>();

			hm.put("tcId", strTCId);
		
			System.out.println(hm.put("tcId", strTCId));
			hm.put("objective", strTO);
			System.out.println(hm.put("objective", strTO));
			hm.put("automationResult", strResult);
			System.out.println(hm.put("automationResult", strResult));
			if (strResult == "PASS") {
				hm.put("reasonForFailure", "NIL");
				System.out.println(hm.put("reasonForFailure", "NIL"));
			} else {
				hm.put("reasonForFailure", strReason);
				System.out.println(hm.put("reasonForFailure", strReason));
			}
			hm.put("browser", strbrowser);
			System.out.println(hm.put("browser", strbrowser));
			hm.put("timeTaken", strtimetaken);
			System.out.println(hm.put("timeTaken", strtimetaken));
			hm.put("build", strversion);
			System.out.println(hm.put("build", strversion));
			
			if(EnvDetails.getProperty("urlEU").contains("qa3")){
				hm.put("server", "QA3");
			}else if(EnvDetails.getProperty("urlEU").contains("qa")){
				hm.put("server", "QA");
			}else if(EnvDetails.getProperty("urlEU").contains("beezag")){
				hm.put("server", "LIVE");
			}else if(EnvDetails.getProperty("urlEU").contains("p2")){
				hm.put("server", "P2");
			}else if(EnvDetails.getProperty("urlEU").contains("int2")){
				hm.put("server", "INT2");
			}
			//hm.put("timeStamp", String.valueOf(lDateTime));
			hm.put("timeStamp",strversion + strDate + "QA");
			//hm.put("timeStamp", "1292573406009");
			//System.out.println(hm.put("timeStamp", String.valueOf(lDateTime)));
			String strRun_on = RunON();
			
			hm.put("runOn", strRun_on);
			System.out.println(hm.put("runOn", strRun_on));
			hm.put("date", strDate);
			System.out.println(hm.put("date", strDate));
			hm.put("time", strstarttime);
			System.out.println(hm.put("time", strstarttime));
			hm.put("videoUrl", StrSessionId);
			 System.out.println(hm.put("videoUrl", StrSessionId));

			AddTestCase objadd = new AddTestCase();
			objadd.doPost(hm);
			
		}
	}*/

	@SuppressWarnings("deprecation")
	public void WriteResultdb_Excel(String strTCId, String strTO,
			String strResult, double dbTimeTaken,
			String FILE_PATH, boolean blnwrite, String strstarttime,
			String strDate, String strbrowser,
			String strBuild ,String strCycleEnviMapID) throws Exception {

		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"MM/dd/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		// strDate = date.toString();



		// WRITE RESULTS TO EXCEL UNDER ANY CONDITION WITHOUT CHECKING ANY FLAG.

		// Read the existing file
		Workbook wb = Workbook.getWorkbook(new File(FILE_PATH));

		// Create a writable workbook with the same name using the workbook
		// object that has been read from file
		WritableWorkbook wwb = Workbook.createWorkbook(new File(FILE_PATH), wb);

		// Total number of rows in the sheet
		int intRowCount = wwb.getSheet(0).getRows();
		for (int intRow = 4; intRow <= intRowCount; intRow++) {
			// Target cell
			WritableCell cell = wwb.getSheet(0).getWritableCell(1, intRow);

			if (cell.getType() == CellType.EMPTY) {
				WritableCellFormat wcf = new WritableCellFormat();
				wcf.setBorder(Border.ALL, BorderLineStyle.THIN);
				wcf.setWrap(true);

				WritableFont courier10pt = new WritableFont(
						WritableFont.COURIER, 10);
				// Define the cell format
				courier = new WritableCellFormat(courier10pt);
				wcf.setFont(courier10pt);

				Label label0 = new Label(0, intRow, "", wcf);
				wwb.getSheet(0).addCell(label0);

				// Enter the TC ID
				Label label1 = new Label(1, intRow, strTCId, wcf);
				wwb.getSheet(0).addCell(label1);
				// Enter Test Objective
				Label label2 = new Label(2, intRow, strTO, wcf);
				wwb.getSheet(0).addCell(label2);
				// Enter Result
				Label label3 = new Label(3, intRow, strResult, wcf);
				wwb.getSheet(0).addCell(label3);
				// Enter Reason
				//Label label4 = new Label(4, intRow, strReason, wcf);
				//wwb.getSheet(0).addCell(label4);
				// Enter Time taken
				String strTime = String.valueOf(dbTimeTaken);
				Label label4 = new Label(4, intRow, strTime, wcf);
				wwb.getSheet(0).addCell(label4);

				//String strRes = RunON();
				//Label label5 = new Label(5, intRow, strRes, wcf);
				//wwb.getSheet(0).addCell(label5);
				
				// Enter Date
				Label label7 = new Label(7, intRow, strDate, wcf);
				wwb.getSheet(0).addCell(label7);
				// Write the data
				wwb.write();
				intRow = intRowCount + 1;
			}
		}
		wwb.close();

		// WRITE RESULTS TO QNET WHEN THE FLAG IS SET AS TRUE IN THE PROPERTY
		// FILE.
		if (blnwrite == true) {

			// Enters this loop when results should be written to Qnet
			// Fetch the Build ID and Cycle Environment Map ID from Property file
			//String strBuild = EnvDetails.getProperty("Build");
			//String strCycleEnviMapID = EnvDetails.getProperty("CycleEnviMapID");

			// Removes the String Prefixes of Test Case ID value.
			/*if (strTCId.startsWith("BQS-")) {
				strTCId = strTCId.substring(4);
			}
			if (strTCId.startsWith("FTS-")) {
				strTCId = strTCId.substring(5);
			}
*/
			// Converts time taken value from Seconds to Minutes
			dbTimeTaken = dbTimeTaken / 60;			
			//strReason=strReason+"";
			//strReason = strReason.replace("'", "''");
			// Write Results to Qnet Database.
			writeToDB(strCycleEnviMapID, strTCId, strBuild, strResult,
					 dbTimeTaken, FILE_PATH, strDate + " "
							+ strstarttime, strbrowser);

		}

	}
	
	private int userWarning() {
		// TODO Auto-generated method stub
		int response = 999;
		try {

			Object[] options = { "OK", "CANCEL" };
			response = JOptionPane.showOptionDialog(null,
					"Results will be written to Qnet.Click OK to continue",
					"Warning",

					JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,

					null, options, options[0]);
			switch (response) {
			case 0:
				log4j.info("OK Clicked");
				break;
			case 1:
				log4j.info("Cancel Clicked");
				break;
			default:
				log4j.info("Invalid selection");

			}
		}// end of try
		catch (Exception e) {
			log4j.info("Exception occured while displaying warning" + e);
		}
		return response;
	}
	
	public void writeToDB(String strCycleEnviMapID, String strTestCaseID,
			String strBuildID, String strResult,
			double dblTimeTaken, String strFilePath, String strExecutedDate,
			String strBrowserName) throws Exception {
		String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; // Start JDBC
		String strSqlURL = "jdbc:sqlserver://192.168.27.7;DatabaseName=QNET";
		String strUsername = "autoaccess";
		String strPassword = "admin@456";
		String strInsertSQL;

		try {
			Class.forName(driverName); // LOAD THE DATABASE DRIVER
			Connection conn = DriverManager.getConnection(strSqlURL,strUsername, strPassword);
			// ESTABLISH THE CONNECTION TO THE DATABASE

			Statement stmt = conn.createStatement(); // GET A STATEMENT FOR THE CONNECTION
			strInsertSQL = "Insert into tblAutomationResults "
					+ "(CycleEnviMapID,TestCaseID,BuildID,Result,Comments,TimeTaken,FilePath,ExecutedDate,BrowserName) values "
					+ "('" + strCycleEnviMapID + "','" + strTestCaseID + "','"
					+ strBuildID + "','" + strResult +  "','" + dblTimeTaken + "','" + strFilePath + "','"
					+ strExecutedDate + "','" + strBrowserName + "')"; // Insert
																		// a
																		// record*/

			stmt.executeUpdate(strInsertSQL); // EXECUTE THE SQL QUERY AND STORE IN RESULTS SET
			// CLOSE THE RESULT, STATEMENT AND CONNECTION
			stmt.close();
			conn.close();
			System.out.println("Insert to Table was successful");
		
		}catch (SQLException se) {//// HANDLE THE SQL EXCEPTION
			System.out.println("SQL Exception:");
			// PRINT TILL ALL THE ECEPTIONS ARE RAISED
			while (se != null) {
				System.out.println("State : " + se.getSQLState());
				System.out.println("Message: " + se.getMessage());
				System.out.println("Error : " + se.getErrorCode());
				se = se.getNextException();
			}
			
		}catch (Exception e) {//// CATCH THE CLASS EXCEPTION	
			System.out.println(e);
		}
	}
	

	/**
	 * This function is used calculate the Time taken for test case execution
	 */
	public double TimeTaken(Date dtStartDate) {
		Date dtEndDate = new Date();
		double dtTimeTaken = dtEndDate.getTime() - dtStartDate.getTime();
		dtTimeTaken = dtTimeTaken / 1000;
		return dtTimeTaken;

	}

	public String RunON() throws Exception {
		String strResult = "";

		if (EnvDetails.getProperty("Server").equals("saucelabs.com")) {
			strResult = "Sauce Labs";
		} else {
			strResult = "Local System";
		}
		return strResult;
	}

	public void WriteTestDatatoSpecifiedCell(String strTestData,
			String strFilePath, String strSheetName, int intRow, int intCol)
			throws Exception {

		// Read the existing file
		Workbook wb = Workbook.getWorkbook(new File(strFilePath));

		// Create a writable workbook with the same name using the workbook
		// object that has been read from file
		WritableWorkbook wwb = Workbook.createWorkbook(new File(strFilePath),
				wb);

		WritableCellFormat wcf = new WritableCellFormat();
		wcf.setBorder(Border.ALL, BorderLineStyle.THIN);
		wcf.setWrap(true);

		WritableFont courier10pt = new WritableFont(WritableFont.COURIER, 10);
		// Define the cell format
		courier = new WritableCellFormat(courier10pt);
		wcf.setFont(courier10pt);

		Label label1 = new Label(intCol, intRow, strTestData, wcf);
		wwb.getSheet(strSheetName).addCell(label1);

		// Write the data
		wwb.write();
		wwb.close();
	}
	
	
	public void WriteRunDetails(String strBuild, String strElemDetails, String FILE_PATH ) throws Exception {

		// Read the existing file
		Workbook wb = Workbook.getWorkbook(new File(FILE_PATH));

		// Create a writable workbook with the same name using the workbook
		// object that has been read from file
		WritableWorkbook wwb = Workbook.createWorkbook(new File(FILE_PATH), wb);

		// Total number of rows in the sheet
		int intRowCount = wwb.getSheet(0).getRows();
		for (int intRow = 0; intRow <= intRowCount; intRow++) {
			// Target cell
			WritableCell cell = wwb.getSheet(0).getWritableCell(1, intRow);

			if (cell.getType() == CellType.EMPTY) {
				WritableCellFormat wcf = new WritableCellFormat();
				wcf.setBorder(Border.ALL, BorderLineStyle.THIN);
				wcf.setWrap(true);

				WritableFont courier10pt = new WritableFont(WritableFont.COURIER, 10);
				// Define the cell format
				courier = new WritableCellFormat(courier10pt);
				wcf.setFont(courier10pt);

				// Enter the Build
				Label label1 = new Label(1, intRow, strBuild, wcf);
				wwb.getSheet(0).addCell(label1);
				// Enter Element Details
				Label label2 = new Label(2, intRow, strElemDetails, wcf);
				wwb.getSheet(0).addCell(label2);
	   

				// Write the data
				wwb.write();
				intRow = intRowCount + 1;
			}
		}
		wwb.close();
	}	
	
	public void WriteDraftResultdb_Excel(String strTCId, String strTO,
			String strSection, String strRunID,String strURL ,String FILE_PATH) throws Exception {


		// Read the existing file
		Workbook wb = Workbook.getWorkbook(new File(FILE_PATH));

		// Create a writable workbook with the same name using the workbook
		// object that has been read from file
		WritableWorkbook wwb = Workbook.createWorkbook(new File(FILE_PATH), wb);

		// Total number of rows in the sheet
		int intRowCount = wwb.getSheet(0).getRows();
		for (int intRow = 4; intRow <= intRowCount; intRow++) {
			// Target cell
			WritableCell cell = wwb.getSheet(0).getWritableCell(1, intRow);

			if (cell.getType() == CellType.EMPTY) {
				WritableCellFormat wcf = new WritableCellFormat();
				wcf.setBorder(Border.ALL, BorderLineStyle.THIN);
				wcf.setWrap(true);

				WritableFont courier10pt = new WritableFont(
						WritableFont.COURIER, 10);
				// Define the cell format
				courier = new WritableCellFormat(courier10pt);
				wcf.setFont(courier10pt);

				Label label0 = new Label(0, intRow, "", wcf);
				wwb.getSheet(0).addCell(label0);

				// Enter the TC ID
				Label label1 = new Label(1, intRow, strTCId, wcf);
				wwb.getSheet(0).addCell(label1);
				// Enter Test Objective
				Label label2 = new Label(2, intRow, strTO, wcf);
				wwb.getSheet(0).addCell(label2);
				// Enter Section
				Label label3 = new Label(3, intRow, strSection, wcf);
				wwb.getSheet(0).addCell(label3);
				// Enter run ID
				Label label4 = new Label(4, intRow, strRunID, wcf);
				wwb.getSheet(0).addCell(label4);
				// Enter URL to open Draft
				Label label5 = new Label(5, intRow, strURL, wcf);
				wwb.getSheet(0).addCell(label5);
				
				// Write the data
				wwb.write();
				intRow = intRowCount + 1;
			}
		}
		wwb.close();	
	}
	
	public void WriteLosAngelRunResults_Excel(String strIncidentNo, String strRunRecordID, 
			String strAccountNo,String FILE_PATH) throws Exception {



		// Read the existing file
		Workbook wb = Workbook.getWorkbook(new File(FILE_PATH));

		// Create a writable workbook with the same name using the workbook
		// object that has been read from file
		WritableWorkbook wwb = Workbook.createWorkbook(new File(FILE_PATH), wb);

		// Total number of rows in the sheet
		int intRowCount = wwb.getSheet(0).getRows();
		for (int intRow = 4; intRow <= intRowCount; intRow++) {
			// Target cell
			WritableCell cell = wwb.getSheet(0).getWritableCell(1, intRow);

			if (cell.getType() == CellType.EMPTY) {
				WritableCellFormat wcf = new WritableCellFormat();
				wcf.setBorder(Border.ALL, BorderLineStyle.THIN);
				wcf.setWrap(true);

				WritableFont courier10pt = new WritableFont(
						WritableFont.COURIER, 10);
				// Define the cell format
				courier = new WritableCellFormat(courier10pt);
				wcf.setFont(courier10pt);

				Label label0 = new Label(0, intRow, "", wcf);
				wwb.getSheet(0).addCell(label0);

				// Enter the TC ID
				Label label1 = new Label(1, intRow, strIncidentNo, wcf);
				wwb.getSheet(0).addCell(label1);
				// Enter Test Objective
				Label label2 = new Label(2, intRow, strRunRecordID, wcf);
				wwb.getSheet(0).addCell(label2);
				// Enter Section
				Label label3 = new Label(3, intRow, strAccountNo, wcf);
				wwb.getSheet(0).addCell(label3);
								
				// Write the data
				wwb.write();
				intRow = intRowCount + 1;
			}
		}
		wwb.close();	
	}
}
