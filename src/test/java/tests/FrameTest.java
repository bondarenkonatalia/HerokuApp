package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FrameTest extends BaseTest{
    @Test
    public void openIframe(){
        framePage.goToFramePage();
        framePage.goToIframePage();
    }
    @Test
    public void checkTextInsideElementCorrect(){
        framePage.goToFramePage();
        framePage.goToIframePage();
        String getTextByFrame = framePage.getTextByFrame();
        assertEquals(getTextByFrame,"Your content goes here.","Текст сообщения не верен");
    }
}

