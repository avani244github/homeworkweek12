package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);

    }

    @Test
    public void loginPage() {
        driver.findElement(By.className("ico-login")).click();
        String actualTest = driver.findElement(By.xpath("//div[@class ='master-wrapper-content']/div/div/div/div[1]/h1")).getText();
        String expectedText = "Welcome, Please Sign In!";
        Assert.assertEquals(actualTest,expectedText);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        driver.findElement(By.className("ico-login")).click();
     driver.findElement(By.name("Email")).sendKeys("Patelavani244@gmail.com");
     driver.findElement(By.id("Password")).sendKeys("123456");
     driver.findElement(By.xpath("//div[@class='master-wrapper-content']/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();//click on login button
     String actualResult = driver.findElement(By.className("ico-logout")).getText();
     String expectedResult = "Log out";
     Assert.assertEquals(actualResult,expectedResult);

    }
   @Test
  public void verifyTheErrorMessage(){
       driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.name("Email")).sendKeys("patelavani244@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("12124343");
       driver.findElement(By.xpath("//div[@class='master-wrapper-content']/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
       String actualErrorMsg = driver.findElement(By.xpath("//div[@class='returning-wrapper fieldset']/form/div[1]")).getText();
       System.out.println(actualErrorMsg);
      String expectedResult ="Login was unsuccessful. Please correct the errors and try again.The credentials provided are incorrect";
     Assert.assertEquals(actualErrorMsg,expectedResult);

    }

    @After
    public void endTest() {
        //closeBrowser();

    }
}
