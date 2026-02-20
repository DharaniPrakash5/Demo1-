package com.learnpom.pages;

import org.openqa.selenium.By;

import com.learnpom.base.ProjectSpecificMethod;

public class LeadsPage  extends ProjectSpecificMethod{
	public CreateLeadPage user_clicks_the_create_lead_link() {
		driver.findElement(By.linkText("Create Lead")).click();
	    return new CreateLeadPage();
	}
}
