/***************************************************************************************************************************
	' Description: This common function is used to perform all the functions related to the SQL Server database 
	' Precondition:  N/A
	' Arguments:See individual functions below
	' Returns:strReturn
	' Date: 21/11/2011
	' Author:QSG
	'---------------------------------------------------------------------------------
	' Modified Date                            Modified By
	' 
	'***********************************************************************************************************************/


package com.resultech.support;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.logging.Logger;
public class DBFunctions  {
	Properties ElementDetails;	
	static Logger log4j = Logger
	.getLogger("com.qsgsoft.EMSBilling.Shared.Login");
	public Properties EnvDetails;
	
	
	/***************************************************************************************************************************
	' Description: This common function is used to establish a connection to the SQL Server database 
	' Precondition:  N/A
	' Arguments: DB Username, DB Password
	' Returns:strReturn(Blank if Pass, Error message if fail)
	' Date: 21/11/2011
	' Author:QSG
	'---------------------------------------------------------------------------------
	' Modified Date                            Modified By
	' 
	'***********************************************************************************************************************/
	public Connection estConnection(String pStrDBName,String pStrUname,String pStrPwd) throws Exception{
		
		//Create an object to refer to the Element ID Properties file
//		ElementId_properties objelementProp = new ElementId_properties();
//		ElementDetails = objelementProp.ElementId_FilePath();
//
		//Create an object to refer to the Environment Properties file
		ReadEnvironment objReadEnvironment = new ReadEnvironment();
		EnvDetails = objReadEnvironment.ReadEnvironment();
		
		String DBIPAddress=EnvDetails.getProperty("DBIPAddress");
		//Declare connection parameter
		Connection conn = null;		
		//Using MYSQL	
		String strConnectionUrl= "jdbc:mysql://"+DBIPAddress+":3306/"+pStrDBName+"";		
		try{
			try{
				//Loading the driver... 
				Class.forName( "com.mysql.jdbc.Driver" );
			
			}catch( java.lang.ClassNotFoundException e ){				
				log4j.info("Class not found.Exception Occured: "+e.toString());
			} 
			conn = DriverManager.getConnection(strConnectionUrl,pStrUname,pStrPwd);
			log4j.info("Connected to Database");
			
		}catch(Exception e){
			log4j.info("Exception Occured: "+e.toString());
			
		}
		
		return conn;
	}
	/***************************************************************************************************************************
    ' Description: This common function is used to establish a connection to the SQL Server database 
    ' Precondition:  N/A
    ' Arguments: DB Username, DB Password,strDBName
    ' Returns:strReturn(Blank if Pass, Error message if fail)
    ' Date: 22/01/2013
    ' Author:QSG
    '---------------------------------------------------------------------------------
    ' Modified Date                            Modified By
    ' 
    '***********************************************************************************************************************/
    public Connection estPostgreConnection(String strDBName,String strUname,String strPwd) throws Exception{
          
          //Create an object to refer to the Element ID Properties file


          //Create an object to refer to the Environment Properties file
          ReadEnvironment objReadEnvironment = new ReadEnvironment();
          EnvDetails = objReadEnvironment.ReadEnvironment();
          
          Class.forName("org.postgresql.Driver");
          Connection connection = null;
          //pg_hba.conf
          String DBIPAddress=EnvDetails.getProperty("DBIPAddress");              
          try{
                try{
                      //Loading the driver... 
                      Class.forName("org.postgresql.Driver");
                
                }catch( java.lang.ClassNotFoundException e ){                     
                      //log4j.info("Class not found.Exception Occured: "+e.toString());
                } 
                connection = DriverManager.getConnection("jdbc:postgresql://"+DBIPAddress+":5432/"+strDBName+"","postgres", "qsg2006");
                log4j.info("Connected to Database");
                
          }catch(Exception e){
                log4j.info("Exception Occured: "+"Failed to connect to Postgre DB");
                
          }
          
          return connection;
}
    /***************************************************************************************************************************
    ' Description: This common function is used to retrieve the user details from DB table
    ' Precondition:  N/A
    ' Arguments: Connection, pstrTableName,strUserId
    ' Returns:strReturn(Blank if Pass, Error message if fail)
    ' Date: 22/01/2013
    ' Author:QSG
    '---------------------------------------------------------------------------------
    ' Modified Date                            Modified By
    ' 
    '***********************************************************************************************************************/
    public String[] RetrieveUserDetails(Connection ConParam,String pstrTableName,String strUserId) throws Exception{
    	String lStrReason="";
    	String[] strRunResArray=new String[3];		

    	//Create an object to refer to the Environment Properties file

    	
    	//Pass the retrieved data from the database to the main function
    	try{
    		String SQLEleValue = "select * from \"UserDetails\" where \"UId\"='"+strUserId+"'";
    		PreparedStatement pstmt1 = ConParam.prepareStatement(SQLEleValue);				     
    		ResultSet rs1 = pstmt1.executeQuery();
    		
    		while (rs1.next()){
    			strRunResArray[1] = rs1.getString("UName");
    			strRunResArray[2] = rs1.getString("Password");
    		}     
    		rs1.close();
    		pstmt1.close();						
    		
    	}catch(Exception E){
//    		log4j.info(E);
    		lStrReason=lStrReason+E.toString();
    	}	
    	strRunResArray[0]=lStrReason;
    	return strRunResArray;
    }

	
}
