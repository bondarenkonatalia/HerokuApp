package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DynamicControlsTest extends BaseTest{

    @Test
    public void checkIfThereIsNoCheckboxOnPage(){
        dynamicControlsPage.openDynamicControls();
        dynamicControlsPage.removeButton();
        String text = dynamicControlsPage.getTextItIsGone();

        assertEquals(text,"It's gone!","Текст не совпадает");
        assertTrue(dynamicControlsPage.checkPresenceOfAddButtonOnPage(),"Чекбокс на странице");

    }
    @Test
    public void checkThatInputIsDisabled(){
        dynamicControlsPage.openDynamicControls();
        dynamicControlsPage.checkThatItIsDisabled();
        dynamicControlsPage.clickEnableButton();
        dynamicControlsPage.getTextItIsEnabled();
        dynamicControlsPage.clickDisableButton();
        String text = dynamicControlsPage.getTextItIsDisable();

        assertEquals(text,"It's disabled!","Input enabled");
        assertTrue(dynamicControlsPage.checkPresenceOfEnableButtonOnPage(),"Input enabled");

    }
    @Test
    public void heckThatInputIsEnable(){
        dynamicControlsPage.openDynamicControls();
        dynamicControlsPage.clickEnableButton();
        String text = dynamicControlsPage.getTextItIsEnabled();
        dynamicControlsPage.inputTextInFieldInput();

        assertEquals(text,"It's enabled!","Input disabled");
        assertTrue(dynamicControlsPage.checkPresenceOfDisableButtonOnPage(),"Input disabled");

    }
}
