package com.learnpom.base;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
	//java.lang.NullPointerException:
	
	public static RemoteWebDriver driver;
	@BeforeMethod
	public void preCondition() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	
	@AfterMethod
	public void postCondition() {
		driver.quit();
	}

}
