package automationexercise;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TestCase3 extends BaseClass {

    String baseUrl = "http://automationexercise.com";

    @Before
    public void browserOpen() {
        openBrowser(baseUrl);
    }

    @Test
    public void loginUserWithIncorrectEmailAndPassword() {
        boolean result = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).isEnabled(); //Verify that home page is visible successfully
        System.out.println(result);
        driver.findElement(By.xpath("//div[@class='col-sm-8']/div/ul/li[4]/a")).click(); // Click on 'Signup / Login' button
        String actualResult = driver.findElement(By.xpath("//div[@class='login-form']/h2")).getText();
        String expectedResult = "Login to your account";  //Verify 'Login to your account' is visible

        driver.findElement(By.xpath("//div[@class='login-form']/form/input[2]")).sendKeys("Patelavani244@gmail.com");
        driver.findElement(By.xpath("//div[@class='login-form']/form/input[3]")).sendKeys("234323"); //Enter Incorrect email address and password
        driver.findElement(By.xpath("//div[@class='login-form']/form/button")).click(); // Click 'login' button
        String actualResult1 = driver.findElement(By.xpath("//div[@class='login-form']/form/p")).getText();
        String expectedResult1 = "Your email or password is incorrect!";
    }


    @After
    public void endTest() {
        //closeBrowser();
    }
}
