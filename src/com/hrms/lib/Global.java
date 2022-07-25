package com.hrms.lib;
import org.openqa.selenium.WebDriver;

public class Global {
	public WebDriver driver;
	//standards:- rules to provide testdata & Object related to whole application
	// test data
	public String url="http://127.0.0.1/orangehrm-2.6/Login.php";
	public String un="pranavi";
	public String pswd="pranavi";
	//objects
	public String txtuname="txtUserName";
	public String txtpswd="txtPassword";
	public String loginbtn="Submit";
	public String logoutbtn="Logout";
	
	public String empinfo="rightMenu";
	public String empFN="txtEmpFirstName";
	public String empLN="txtEmpLastName";
	public String addbtn="//input[@value='Add']";
	public String savebtn="btnEdit";
	
	public String clickanyemp="//*[@id='standardView']/table/tbody/tr/td[3]/a";
			
	public String empsavebtn="EditMain";	
	
	public String editbtn="//*[@id=\"btnEditPers\"]";
			
	public String selectempid="loc_code";
	public String selectemidsearchtext="loc_name";
	public String clickonsearchbtn="//input[@value='Search']";
	public String clickonchckbox="chkLocID[]";
	public String clickondltbtn="//input[@value='Delete']";
	
			
}
