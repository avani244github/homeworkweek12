package automationexercise;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TestClass5 extends BaseClass {
    String baseUrl = "http://automationexercise.com";

    @Before
    public void browserOpen(){
        openBrowser(baseUrl);
    }
    @Test
    public void registerUserWithExistingEmail(){
        boolean result = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).isEnabled(); //Verify that home page is visible successfully
        System.out.println(result);
        driver.findElement(By.xpath("//div[@class='col-sm-8']/div/ul/li[4]/a")).click(); // Click on 'Signup / Login' button
        String actualResult = driver.findElement(By.xpath("//div[@class='signup-form']/h2")).getText();
        System.out.println(actualResult);
        String expectedResult = "New User Signup!";  // Verify 'New User Signup!' is visible
        Assert.assertEquals(actualResult,expectedResult);
        driver.findElement(By.xpath("//div[@class='signup-form']/form/input[2]")).sendKeys("Avani");
        driver.findElement(By.xpath("//div[@class='signup-form']/form/input[3]")).sendKeys("Patelavani244@gmail.com"); // Enter name and already registered email address
        driver.findElement(By.xpath("//div[@class='signup-form']/form/button")).click();
String actualResult1 = driver.findElement(By.xpath("//div[@class='signup-form']/form/p")).getText(); //Click 'Signup' button
        System.out.println(actualResult1);
        String expectedResult1 ="Email Address already exist!";
        Assert.assertEquals(actualResult1,expectedResult1); //Verify error 'Email Address already exist!' is visible

    }
    @After
        public void endTest(){
            //closeBrowser();
        }

}
