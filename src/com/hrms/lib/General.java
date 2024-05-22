package com.hrms.lib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;


public class General extends Global{
	//test data & object related to whole application
	
	public void openApplication() {
	driver = new ChromeDriver();
	driver.navigate().to(url);
	System.out.println("application opened");
	Reporter.log("application Opened"); 
	Log.info("application opened");
	}
	
	public void login() {
		driver.findElement(By.name(txt_username)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);;
		driver.findElement(By.name(btn_login)).click();
		System.out.println("login completed");
		Reporter.log("login completed"); 
		Log.info("login completed");
	}
	
	public void addEmp(){
		
		driver.findElement(By.xpath(btn_add)).click();
		driver.findElement(By.xpath(fn_txt)).sendKeys(fn);
		driver.findElement(By.xpath(ln_txt)).sendKeys(ln);
		driver.findElement(By.xpath(btn_save)).click();
	System.out.println("employee added");
	Reporter.log("employee added"); 
	Log.info("employee added");		
	}
	
	public void editEmp() {
		
		driver.findElement(By.xpath(emp_nm)).click();
		driver.findElement(By.xpath(btn_edit)).click();
		driver.findElement(By.xpath(nw_fn_txt)).clear();
		driver.findElement(By.xpath(nw_fn_txt)).sendKeys(nw_fn);
		driver.findElement(By.xpath(nw_ln_txt)).clear();
		driver.findElement(By.xpath(nw_ln_txt)).sendKeys(nw_ln);
		driver.findElement(By.xpath(add_emp_save_btn)).click();
	System.out.println("employee edited");
	Reporter.log("employee edited"); 
	Log.info("employee edited");
	}
	
	public void deleteEmp() {	
		driver.findElement(By.xpath(chk_box)).click();
		driver.findElement(By.xpath(btn_dlt)).click();
		System.out.println("employee deleted");
		Reporter.log("employee deleted"); 
		Log.info("employee deleted");
	}

	public void enterFrame(){
		driver.switchTo().frame(frm_id);
		System.out.println("entered in to frame");
		Reporter.log("entered in to frame"); 
		Log.info("entered in to frame");
	}
	
	public void exitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("exit from frame");
		Reporter.log("exit from frame"); 
		Log.info("exit from frame");
	}
	
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("logout completed");
		Reporter.log("logout completed"); 
		Log.info("logout completed");
		
	}
	
	public void closeApplication() {
		driver.close();
		System.out.println("application closed");
		Reporter.log("application closed"); 
		Log.info("application closed");
		
		
	}
}
