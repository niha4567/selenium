package com.hrms.testscripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import com.hrms.lib.General;

public class TC002_Add_New_Employee {
	@Test
	public void tc002() throws Exception{
		 DOMConfigurator.configure("log4j.xml");
		General obj=new General();
		        obj.openApplication();
		        obj.loginApp();
		        obj.enterFrame();
		        obj.addButton();
		        obj.exitFrame();
		        obj.logOut();
		        obj.closeApplication();
		        
	}
	

}
