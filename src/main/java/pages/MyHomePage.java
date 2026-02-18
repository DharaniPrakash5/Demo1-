package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod {
	public LeadsPage user_clicks_the_leads_link() {
		driver.findElement(By.linkText("Leads")).click();
		return  new LeadsPage();
	}
}
