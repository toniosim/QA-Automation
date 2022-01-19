package com.mycompany.framework.abstracttestsuite;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.mycompany.framework.objects.AppObj;

import org.testng.annotations.AfterTest;

public class AbstractTestSuite {
	
	AppObj appObj = new AppObj();
	
	public AppObj sel() {
		return appObj;
	}
	
	// we might have to use BeforeMethod tag here bc all our tests are different methods
	@BeforeTest
	public void abstractBeforeTest() {
		appObj = startBrowser();
		System.out.println("I'MA START THIS TEST");
	}
	
	// we might have to use AfterMethod tag here bc all our tests are different methods
	@AfterTest
	public synchronized void abstractTearDownAFterTest() {
		System.out.println("I'MA END THIS TEST");
		appObj.Page.quitBrowser();
	}
	
	public AppObj startBrowser() {
		appObj.LandingPage.open();
		appObj.Page.maximizeWindow();
		appObj.Page.visit("https://formy-project.herokuapp.com");
		return appObj;
	}
}
