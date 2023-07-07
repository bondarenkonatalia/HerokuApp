package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BasePage {
    WebDriver driver;
    final String BASE_URL = "http://the-internet.herokuapp.com/";
    public BasePage(WebDriver driver) {

        this.driver = driver;
    }
}
