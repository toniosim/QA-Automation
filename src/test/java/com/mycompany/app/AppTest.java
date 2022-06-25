package com.mycompany.app;

import org.testng.annotations.*;
import org.testng.asserts.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.mycompany.app.pages.LandingPage;
import com.mycompany.app.pages.Page;
import com.mycompany.framework.abstracttestsuite.AbstractTestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends AbstractTestSuite
{
	
	Assertion asert = new Assertion();
	WebDriver driver;
	
    /**
     * chrome test
     */
    @Test
    public void chromeDriverTest()
    {
    	driver = new ChromeDriver();
    	Page page = new Page(driver);
    	page.visit("https://www.google.com");
    	String currentURL = page.getURL();
    	
    	asert.assertTrue(currentURL.contains("google"));
    }
    
    /**
     * firefox test
     */
    @Test
    public void geckoDriverTest()
    {
    	driver = new FirefoxDriver();
    	Page page = new Page(driver);
    	page.visit("https://www.google.com");
    	String currentURL = page.getURL();
    	
    	asert.assertTrue(currentURL.contains("google"));
    }
    
    /**
     * Formy Test
     */
    @Test
    public void formyTest() {
    	
    	sel().LandingPage.clickLogo();
    	
    	asert.assertTrue(sel().LandingPage.getURL().contains("formy-project"));
    }
}
