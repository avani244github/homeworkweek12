package automationexercise;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TestCase4 extends BaseClass {
    String baseUrl = "http://automationexercise.com";

    @Before
    public void browserOpen() {
        openBrowser(baseUrl);
    }

    @Test
    public void logoutUser() {
        boolean result = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).isEnabled(); //Verify that home page is visible successfully
        System.out.println(result);
        driver.findElement(By.xpath("//div[@class='col-sm-8']/div/ul/li[4]/a")).click(); // Click on 'Signup / Login' button
        String actualResult = driver.findElement(By.xpath("//div[@class='login-form']/h2")).getText();
        String expectedResult = "Login to your account";  //Verify 'Login to your account' is visible
        Assert.assertEquals(actualResult, expectedResult);
        driver.findElement(By.xpath("//div[@class='login-form']/form/input[2]")).sendKeys("Patelavani244@gmail.com");
        driver.findElement(By.xpath("//div[@class='login-form']/form/input[3]")).sendKeys("12345"); //Enter correct email address and password
        driver.findElement(By.xpath("//div[@class='login-form']/form/button")).click(); // Click 'login' button
        String actualResult1 = driver.findElement(By.xpath("//div[@class='shop-menu pull-right']/ul/li[10]/a")).getText();
        System.out.println(actualResult1);
        // String expectedResult1 = "Logged in as Avani";  //Verify 'Login to your account' is visible //Verify that 'Logged in as username' is visible
        driver.findElement(By.xpath("//header[@id='header']/div/div/div/div[2]/div/ul/li[4]/a")).click(); //Click 'Logout' button
        String actualResult2 = driver.findElement(By.xpath("//div[@class='login-form']/h2")).getText();
        System.out.println(actualResult2);
        String expectedResult2 = "Login to your account";  // Verify that user is navigated to login page
        Assert.assertEquals(actualResult2,expectedResult2);

    }

    @After
    public void endTest() {
        //closeBrowser();
    }
}

