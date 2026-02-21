package com.learnpom.base;

import java.time.Duration;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethod {
	//java.lang.NullPointerException:
	
	public static RemoteWebDriver driver;
	@BeforeMethod
    public void preCondition() {

        WebDriverManager.firefoxdriver().setup();

        FirefoxOptions options = new FirefoxOptions();

        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");

        options.addArguments("--headless");

        driver = new FirefoxDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://leaftaps.com/opentaps/control/main");
    }
	@AfterMethod
	public void postCondition() {
		driver.quit();
	}

}
