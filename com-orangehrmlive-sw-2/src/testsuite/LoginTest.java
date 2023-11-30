package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setup(){
        openBrowser(baseUrl);

    }
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){

driver.findElement(By.xpath("//div[@class='orangehrm-login-form']/form/div[1]/div/div[2]/input")).sendKeys("Admin");
driver.findElement(By.xpath("//div[@class='orangehrm-login-form']/form/div[2]/div/div[2]/input")).sendKeys("admin123");
driver.findElement(By.xpath("//div[@class='orangehrm-login-form']/form/div[3]/button")).click();
String actualResult = driver.findElement(By.xpath("//header[@class='oxd-topbar']/div[1]/div[1]/span/h6")).getText();
String expectedResult = "Dashboard";
        Assert.assertEquals(actualResult,expectedResult);
    }
    @After
    public void endTest(){
       // closeBrowser();
    }

}
