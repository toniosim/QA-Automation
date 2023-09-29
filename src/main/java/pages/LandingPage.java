package pages;

import objects.ElementBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
