package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC001_Login extends ProjectSpecificMethods{	

	@BeforeTest
	public void setValues() {
		testCaseName = "Login";
		testDescription = "Login testCase using email and Password";
		nodes = "Leads";
		authors = "Silvia Jessy";
		category = "Smoke";
		dataSheetName = "TC001";
	}

	@Test(dataProvider = "fetchData")
	public void createLeaf(String email, String password) {
		new LoginPage(driver, node, test)
		.enterUserName(email)
		.enterPassword(password)
		.clickLogin()
		.VerifyThePageTitle();
	
	}


}





