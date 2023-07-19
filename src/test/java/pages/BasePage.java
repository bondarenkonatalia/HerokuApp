package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;
    final String BASE_URL = "http://the-internet.herokuapp.com/";
    public BasePage(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver,10);
    }
}
