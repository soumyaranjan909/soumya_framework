package com.hrms.testscripts;
import org.testng.annotations.Test;
import com.hrms.lib.General;

public class TC_002 {
	//public static void main(String args[])throws Exception {
	@Test
	public void tc002()throws Exception {
		General obj = new General();
		
		obj.openApplication();
		Thread.sleep(2000);
		obj.login();
		Thread.sleep(2000);
		obj.enterFrame();
		obj.addEmp();
		Thread.sleep(2000);
		obj.exitFrame();
		obj.logout();
		Thread.sleep(2000);
		obj.closeApplication();
	}

}

