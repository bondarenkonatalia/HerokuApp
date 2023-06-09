import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.openqa.selenium.WebElement.*;

public class DropdownTest extends BaseTest {

    @Test
    public void dropdownList() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.findElement(By.cssSelector("[Please select an option]")).click();

    }
}
