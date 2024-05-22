package com.hrms.testscripts;
import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;
import com.hrms.lib.General;


public class TC_003 {
	@Test
	public void tc_004()throws Exception {
	//public static void main(String args[])throws Exception {
		DOMConfigurator.configure("log4j.xml");
		General obj = new General();
		
		obj.openApplication();
		Thread.sleep(2000);
		obj.login();
		Thread.sleep(2000);
		obj.enterFrame();
		obj.editEmp();
		Thread.sleep(2000);
		obj.exitFrame();
		obj.logout();
		Thread.sleep(2000);
		obj.closeApplication();
	}

}
