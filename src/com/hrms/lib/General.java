package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrms.utility.Log;


public class General extends Global {
	//standards rules:- to provide all re-usable function/method related to whole application
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("openApplication");
		Log.info("openApplication");
		Reporter.log("open Application");
	}
		
		
	public void closeApplication() {
		driver.close();
		System.out.println("closeApplication");
		
		Log.info("closeApplication");
		Reporter.log("close Application");
				
			}
	public void loginApp() {
		driver.findElement(By.name(txtuname)).sendKeys("pranavi");
		driver.findElement(By.name(txtpswd)).sendKeys( );
		driver.findElement(By.name(loginbtn)).click();
		System.out.println("Login Completed");
		Log.info("Login Completed");
		Reporter.log("Login Completed");
		
	}
	public void logOut() {
	driver.findElement(By.linkText(logoutbtn)).click();
	System.out.println("Logout Application");
	Log.info("Logout Application");
	Reporter.log("Logout Application");
	}
	public void enterFrame() {
		driver.switchTo().frame(empinfo);
		System.out.println("Enter into frame");
		
	}   
	public void exitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("Exit into frame");
	}
	public void addButton() {
	driver.findElement(By.xpath(addbtn)).click();
	driver.findElement(By.name(empFN)).sendKeys("rama");
	driver.findElement(By.name(empLN)).sendKeys("devi");
	driver.findElement(By.id(savebtn)).click();

	}
	public void clickeditbtn() {
		driver.findElement(By.xpath(editbtn)).click();
		driver.findElement(By.name(empFN)).sendKeys("pranu");
		driver.findElement(By.name(empLN)).sendKeys("Reddy");
		driver.findElement(By.name(empsavebtn)).click();
	
	}
	public void selectdropdown() {
		Select sl=new Select(driver.findElement(By.name(selectempid)));
		sl.selectByVisibleText("Emp.ID");
		
	}
	public void enterempid() {
		driver.findElement(By.name(selectemidsearchtext)).sendKeys("0001");
		driver.findElement(By.name(clickonsearchbtn)).click();
		driver.findElement(By.name(clickonchckbox)).click();
		driver.findElement(By.name(clickondltbtn)).click();
		}
	public void bydropdown() {
		Select sl=new Select(driver.findElement(By.name("loc_code")));
		sl.selectByVisibleText("Emp.ID");
		driver.findElement(By.id("loc_name")).sendKeys("0001");
		driver.findElement(By.xpath("//input[@value='Search")).click();
		driver.findElement(By.name("chkLocID[]")).click();
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		
		
		
				
	}
	
        }
	


