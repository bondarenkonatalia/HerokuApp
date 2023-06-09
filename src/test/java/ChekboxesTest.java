import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class ChekboxesTest extends BaseTest {

    @Test

    public void checkCheckboxes(){
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("[type='checkbox']"));

        assertFalse(checkboxes.get(0).isSelected(),"Чек-бокс включен ");

        checkboxes.get(0).click();

        assertTrue(checkboxes.get(0).isSelected(),"Чек-бокс выключен");


        assertTrue(checkboxes.get(1).isSelected(),"Чек-бокс включен ");

        checkboxes.get(1).click();

        assertFalse(checkboxes.get(1).isSelected(),"Чек-бокс выключен");
    }
}
