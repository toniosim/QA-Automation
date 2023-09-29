package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * basically a wrapper class for the selenium WebElement class
 * going to make it so that we can make elements way more custom with increased complexity
 * all other objects on the page will inherit this class
 *
 * @author tonio
 *
 */
public class ElementBase {

    private By myBy;
    private WebDriver driver;
    private String label;


    /**
     *
     * @param by - locator for the element
     * @param driver - webdriver so we can use it in methods
     * @param label - what we call the element in english
     */
    public ElementBase(By by, WebDriver driver, String label) {
        this.myBy = by;
        this.driver = driver;
        this.label = label;
    }

    public void click() {
        driver.findElement(myBy).click();
    }

    public String getLabel() {
        return label;
    }

}
