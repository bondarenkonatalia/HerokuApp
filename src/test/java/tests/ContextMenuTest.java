package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTest {
    @Test
    public void textValidationOnAlert() {
        contextMenuPage.open();
        contextMenuPage.rightClickHotSpot();
        Alert alert = driver.switchTo().alert();
        assertEquals(alert.getText(), "You selected a context menu", "Текст сообщения не верный");

    }

}

