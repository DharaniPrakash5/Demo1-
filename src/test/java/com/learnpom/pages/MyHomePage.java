package com.learnpom.pages;

import org.openqa.selenium.By;

import com.learnpom.base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod {
	public LeadsPage user_clicks_the_leads_link() {
		driver.findElement(By.linkText("Leads")).click();
		return  new LeadsPage();
	}
}
