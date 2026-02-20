package com.learnpom.pages;

import org.openqa.selenium.By;

import com.learnpom.base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod{

	public LoginPage enterUsername() {
	      driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	      return this;
	}
	public LoginPage enterPassword() {
	      driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	      return this;
	}
	public WelcomePage clickLoginButton() {
          driver.findElement(By.className("decorativeSubmit")).click();
          return new WelcomePage();
	}
}
