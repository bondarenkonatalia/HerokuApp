import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class HerrokuAppTest extends BaseTest {
    @Test
    public void AddRemoveElements() {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addElementButton = driver.findElement(By.cssSelector("[onclick='addElement()']"));
        addElementButton.click();
        addElementButton.click();
        List<WebElement> deleteButtonList = driver.findElements(By.cssSelector("[onclick='deleteElement()']"));
        assertEquals(deleteButtonList.size(), 2, "Элемента не 2");

        deleteButtonList.get(0).click();
        deleteButtonList = driver.findElements(By.cssSelector("[onclick='deleteElement()']"));
        assertEquals(deleteButtonList.size(), 1, "Элемента не 2");
    }

}
