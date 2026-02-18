package runner;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC002_CreateLead extends ProjectSpecificMethod {

	@Test
	public void runCreateLeatTest() {

		LoginPage user = new LoginPage();
		// Singleton design pattern --> constructor chaining
		user.enterUsername().enterPassword().clickLoginButton()
		       .user_clicks_the_crmsfa_link()
				  .user_clicks_the_leads_link()
				     .user_clicks_the_create_lead_link();

	}
}
