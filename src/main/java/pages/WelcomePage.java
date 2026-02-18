package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod {
	
	public MyHomePage user_clicks_the_crmsfa_link() {
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		return new MyHomePage();
	}
}
