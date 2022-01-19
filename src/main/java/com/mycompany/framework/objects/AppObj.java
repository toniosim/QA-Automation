package com.mycompany.framework.objects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mycompany.app.pages.*;

/**
 * object that contains all the different pages
 * @author tonio
 *
 */
public class AppObj {
	
	public WebDriver driver;
	
	public Page Page;
	public LandingPage LandingPage;
	
	public AppObj() {
		// TODO: implement driver logic
		driver = new ChromeDriver();
		
		Page = new Page(driver);
		LandingPage = new LandingPage(driver);
	}

}
