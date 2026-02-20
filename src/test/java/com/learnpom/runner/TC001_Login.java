package com.learnpom.runner;

import org.testng.annotations.Test;

import com.learnpom.base.ProjectSpecificMethod;
import com.learnpom.pages.LoginPage;

public class TC001_Login extends ProjectSpecificMethod {

	@Test
	public void runLoginTest() {
		// Builder pattern
		LoginPage lp = new LoginPage();
		lp.enterUsername();
		lp.enterPassword();
		lp.clickLoginButton();
		
	}
	
}
