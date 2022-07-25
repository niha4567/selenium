package com.hrms.testscripts;
import org.apache.log4j.xml.DOMConfigurator;

import org.testng.annotations.Test;
import com.hrms.lib.General;
@Test
public class TC001_Login_Logout 
{
	public void tc001() throws Exception
	{
		 DOMConfigurator.configure("log4j.xml");
		General gn=new General();
		        gn.openApplication();
		        gn.loginApp();
		        gn.logOut();
		        gn.closeApplication(); 
		        
		
		
	}
	

}
