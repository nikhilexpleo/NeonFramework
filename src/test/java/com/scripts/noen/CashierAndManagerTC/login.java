package com.scripts.noen.CashierAndManagerTC;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.pageFactory.desktopReception.login_PF;



public class login extends BaseTest
{
	private login_PF objlogin_PF;
	
	@Test(priority = 0)
	public void logginFuctionality()
	{
		initializeWebEnvironment("MB");
		objlogin_PF = new login_PF(this);
		objlogin_PF.login();
		objlogin_PF.logout();	
	//	tearDown();
	
	}
/*	// Closing the browser
		@AfterClass
		private void tearDown() 
		{
			tearDownWebEnvironment();
		
		}*/
}
