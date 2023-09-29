package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.*;

/**
 * object that contains all the classes/pages in the application,
 * along with the driver
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

        // a list of all the pages we have classes for, including base page
        Page = new Page(driver);
        LandingPage = new LandingPage(driver);
    }

}