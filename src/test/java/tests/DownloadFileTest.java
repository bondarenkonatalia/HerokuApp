package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;

public class DownloadFileTest extends BaseTest{
    String myLocator = "//a[text() = 'abc.pdf']";

    @Test
    public void downloadFileTest() throws IOException, InterruptedException {
        driver.get("http://the-internet.herokuapp.com/download");
        downloader(myLocator,"abc.pdf");
    }
}
