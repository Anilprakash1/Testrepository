package com.resultech.support;

import jxl.Sheet;
import jxl.Workbook;

import java.io.File;
import java.util.Properties;

public class ReadData {

	/**
	 * This function is used to read data from the Excel file
	 * @throws Exception 
	 */
		public String ReadData(String SheetName, int intRow, int intColumn) throws Exception 
		{
			Paths_Properties objAP = new Paths_Properties();
			Properties pathProps = objAP.Read_FilePath();
						
			String FILE_PATH =pathProps.getProperty("UserDetails_path");
			Sheet ws = null;
		
			// Read the existing file
			Workbook wb = Workbook.getWorkbook(new File(FILE_PATH));
			ws = wb.getSheet(SheetName);
			
			//Read content of the cell	
			String strCellContent = ws.getCell(intColumn-1, intRow-1).getContents();
	    	wb.close();
	    	
			return strCellContent;
	}
	
		public String readInfoExcel(String SheetName, int intRow, int intColumn,String FILE_PATH) throws Exception 
		  {   
		  
		   Sheet ws = null;
		  
		   // Read the existing file
		   Workbook wb = Workbook.getWorkbook(new File(FILE_PATH));
		   ws = wb.getSheet(SheetName);
		   
		   //Read content of the cell 
		   String strCellContent = ws.getCell(intColumn-1, intRow-1).getContents();
		   wb.close();
		   
		   return strCellContent;
		  }
		
	/**
	 * @param args
	 * @throws IOException 
	 * @throws IndexOutOfBoundsException 
	 * @throws WriteException 
	 * @throws BiffException 
	 * @throws RowsExceededException 
	 */
/*	public static void main(String[] args) throws RowsExceededException, BiffException, WriteException, IndexOutOfBoundsException, IOException 
	{
		ReadDataFromExcel rdExcel = new ReadDataFromExcel();
		// TODO Auto-generated method stub
		String strUsername = rdExcel.ReadFromExcel("EndUser", 2, 5);
		String strpassword = rdExcel.ReadFromExcel("EndUser", 2,6);
		
		System.out.println(strUsername);
		System.out.println(strpassword);
	}*/

}
