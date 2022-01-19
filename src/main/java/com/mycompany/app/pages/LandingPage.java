package com.mycompany.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mycompany.framework.objects.ElementBase;
import com.mycompany.framework.objects.Page;

public class LandingPage extends Page {

	public LandingPage(WebDriver driver) {
		super(driver);
	}
	
	public void open() {
		driver.get("https://formy-project.herokuapp.com");
	}
	
	public ElementBase logo() {
		return new ElementBase(By.id("logo"), driver, "Formy Logo");
	}
	
	public void clickLogo() {
		logo().click();
	}

}
