package runner;

import org.testng.annotations.Test;
import base.ProjectSpecificMethod;
import pages.LoginPage;

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
