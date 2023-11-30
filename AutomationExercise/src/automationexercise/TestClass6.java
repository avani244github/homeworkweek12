package automationexercise;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TestClass6 extends BaseClass{
    String baseUrl = "http://automationexercise.com";

    @Before
    public void browserOpen() {
        openBrowser(baseUrl);
    }
    @Test
    public void  verifyTestCasesPage(){
        boolean result = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).isEnabled(); //Verify that home page is visible successfully
        System.out.println(result);
driver.findElement(By.xpath("//div[@class='col-sm-8']/div/ul/li[5]/a")).click(); //Click on 'Test Cases' button
        String actualResult = driver.findElement(By.xpath("//section[@id='form']/div/div[1]/div/h2/b")).getText();
        System.out.println(actualResult);
        String expectedResult = "TEST CASES";
        Assert.assertEquals(actualResult,expectedResult); // Verify user is navigated to test cases page successfully

    }
    @After
        public void endTest() {
            //closeBrowser();
        }
}
