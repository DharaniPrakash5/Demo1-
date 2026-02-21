package com.learnpom.base;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
	//java.lang.NullPointerException:
	
	public static RemoteWebDriver driver;
	@BeforeMethod
	public void preCondition() {

	    EdgeOptions options = new EdgeOptions();

	    options.addArguments("--headless=new");
	    options.addArguments("--disable-gpu");
	    options.addArguments("--no-sandbox");
	    options.addArguments("--disable-dev-shm-usage");
	    options.addArguments("--window-size=1920,1080");

	    driver = new EdgeDriver(options);

	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("http://leaftaps.com/opentaps/control/main");
	}
	@AfterMethod
	public void postCondition() {
		driver.quit();
	}

}
