package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage extends BasePage{
    public static final By HOT_SPOT = By.id("hot-spot");
    Actions actions = new Actions(driver);

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }
    public void open(){
        driver.get (BASE_URL + "context_menu");
    }
    public void rightClickHotSpot(){
        actions.contextClick(driver.findElement(By.id("hot-spot"))).build().perform();

    }
}
