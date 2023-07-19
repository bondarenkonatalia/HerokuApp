package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Instant;

import static org.openqa.selenium.support.ui.ExpectedCondition.*;

public class DynamicControlsPage extends BasePage {
    public static final By REMOVE_BUTTON = By.xpath("//button[@type='button' and text()='Remove']");
    public static final By ADD_BUTTON = By.xpath("//button[@type='button' and text()='Add']");
    public static final By ENABLE_BUTTON = By.xpath("//button[text() = 'Enable']");
    public static final By DISABLE_BUTTON = By.xpath("//button[text() = 'Disable']");
    public By inputDisable = By.xpath("//input[@type='text' and @disabled]");
    public By inputEnable = By.xpath("//input[@type='text']");
    String messageItIsDisable = "//p[@id='message']";
    String messageItIsGone = "//p[@id='message']";
    String messageItIsEnabled = "//p[@id='message']";

    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }

    public void openDynamicControls() {
        driver.get(BASE_URL + "dynamic_controls");
    }

    public void removeButton() {
        driver.findElement(REMOVE_BUTTON).click();
    }

    public String getTextItIsGone() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(messageItIsGone))).getText();
    }

    public boolean checkPresenceOfAddButtonOnPage() {
        boolean isDisplayed = driver.findElement(ADD_BUTTON).isDisplayed();
        return isDisplayed;
    }

    public boolean checkPresenceOfEnableButtonOnPage() {
        boolean isDisplayed = driver.findElement(ENABLE_BUTTON).isDisplayed();
        return isDisplayed;
    }

    public void checkThatItIsDisabled() {
        driver.findElement(inputDisable);
    }

    public void checkThatItIsEnable() {
        driver.findElement(inputEnable);
    }

    public void clickEnableButton() {
        driver.findElement(ENABLE_BUTTON).click();
    }

    public void clickDisableButton() {
        driver.findElement(DISABLE_BUTTON).click();
    }

    public String getTextItIsEnabled() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(messageItIsEnabled))).getText();
    }

    public String getTextItIsDisable() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(messageItIsDisable))).getText();
    }

    public boolean checkPresenceOfDisableButtonOnPage() {
        boolean isDisplayed = driver.findElement(DISABLE_BUTTON).isDisplayed();
        return isDisplayed;
    }
        public void inputTextInFieldInput() {
            driver.findElement(inputEnable).sendKeys("Инпут работает");
        }
    }

