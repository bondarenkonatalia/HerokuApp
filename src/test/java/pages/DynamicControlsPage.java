package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Instant;

public class DynamicControlsPage extends BasePage{
    public static final By REMOVE_BUTTON = By.xpath("//button[@type='button' and text()='Remove']");
    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }

    public void openDynamicControls() {
        driver.get(BASE_URL + "dynamic_controls");
    }
    public void removeButton(){

        driver.findElement(REMOVE_BUTTON).click();
    }
    }


