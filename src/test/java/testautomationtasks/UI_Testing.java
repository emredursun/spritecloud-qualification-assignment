package testautomationtasks;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import testautomationtasks.utilities.UI_TestBase;

public class UI_Testing extends UI_TestBase {
    /*
Scenario
Record button click.
Then execute your test to make sure that ID is not used for button identification.
 */
    @Test
    public void locateButtonWithoutDynamicID(){
        driver.findElement(By.xpath("//a[@href='/dynamicid']")).click();
        String expectedPageTitle = "Dynamic ID";
        Assert.assertTrue(driver.getTitle().equals(expectedPageTitle));

        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    }
    /*
Scenario
    Record primary (blue) button click and press ok in alert popup.
    Then execute your test to make sure that it can identify the button using btn-primary class.
     */
    @Test
    public void classAttribute(){
        driver.findElement(By.xpath("//a[@href='/classattr']")).click();
        String expectedPageTitle = "Class Attribute";
        Assert.assertTrue(driver.getTitle().equals(expectedPageTitle));
        //    Record primary (blue) button click
        driver.findElement(By.xpath("//button[@class='btn class2 btn-primary btn-test']")).click();
        //    press ok in alert popup
        driver.switchTo().alert().accept();
    }
    /*
Scenario
    Record button click and then duplicate the button click step in your test.
    Execute the test to make sure that green button can not be hit twice.
    */
    @Test
    public void hiddenLayers(){
        driver.findElement(By.xpath("//a[@href='/hiddenlayers']")).click();
        String expectedPageTitle = "Hidden Layers";
        Assert.assertTrue(driver.getTitle().equals(expectedPageTitle));

        driver.findElement(By.xpath("")).click();
    }
}
