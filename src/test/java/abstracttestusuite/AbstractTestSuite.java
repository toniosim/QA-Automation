package abstracttestusuite;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import objects.AppObj;

import org.testng.annotations.AfterTest;

public class AbstractTestSuite {

    AppObj appObj = new AppObj();

    public AppObj sel() {
        return appObj;
    }

    @BeforeTest
    public void abstractBeforeTest() {
        appObj = startBrowser();
        // test message
        System.out.println("I'MA START THIS TEST");
    }

    @AfterTest
    public synchronized void abstractTearDownAFterTest() {
        // test message
        System.out.println("I'MA END THIS TEST");
        appObj.Page.quitBrowser();
    }

    // defining behavior at the beginning of every test, when the browser opens
    public AppObj startBrowser() {
        // navigate to the URL of the Landing Page and maximize the window
        appObj.LandingPage.open();
        appObj.Page.maximizeWindow();
        return appObj;
    }
}