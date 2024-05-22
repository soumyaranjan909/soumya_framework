package com.hrms.testscripts;
import org.testng.annotations.Test;
import com.hrms.lib.General;
import org.apache.log4j.xml.DOMConfigurator;

public class TC_001 {	
	@Test
		public void tc001() throws Exception  {
		DOMConfigurator.configure("log4j.xml");
			General obj=new General();	
		
		obj.openApplication();
		Thread.sleep(1000);
		obj.login();
		Thread.sleep(1000);
		obj.logout();
		Thread.sleep(1000);
		obj.closeApplication();
	}

}
