package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page {

    protected WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public void visit(String url) {
        driver.get(url);
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }

    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public void maximizeWindow() {
        driver.manage().window().maximize();
    }

    public void quitBrowser() {
        driver.quit();
    }

}
