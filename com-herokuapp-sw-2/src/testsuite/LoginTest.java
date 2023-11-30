package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl = "http://the-internet.herokuapp.com/login";

    @Before
    public void setup() {
        openBrowser(baseUrl);

    }
    @Test
    public void UserShouldLoginSuccessfullyWithValidCredentials(){
driver.findElement(By.xpath("//div[@class='example']/form/div[1]/div/input")).sendKeys("tomsmith");
driver.findElement(By.xpath("//div[@class='example']/form/div[2]/div/input")).sendKeys("SuperSecretPassword!");
driver.findElement(By.xpath("//div[@class='example']/form/button/i")).click();
String actualResult =driver.findElement(By.xpath("//div[@id='content']/div/h2")).getText();
String expectedResult = "Secure Area";

    }
    @Test
    public void verifyTheUsernameErrorMessage(){
        driver.findElement(By.xpath("//div[@class='example']/form/div[1]/div/input")).sendKeys("tomsmith1");
        driver.findElement(By.xpath("//div[@class='example']/form/div[2]/div/input")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//div[@class='example']/form/button/i")).click();
       String actualResult =driver.findElement(By.xpath("//div[@id='flash-messages']/div")).getText();
       String expectedResult = "Your username is invalid!";
    }
    @Test
    public void verifyThePasswordErrorMessage(){
        driver.findElement(By.xpath("//div[@class='example']/form/div[1]/div/input")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//div[@class='example']/form/div[2]/div/input")).sendKeys("SuperSecretPassword");
        driver.findElement(By.xpath("//div[@class='example']/form/button/i")).click();
        String actualResult =driver.findElement(By.xpath("//div[@id='flash-messages']/div")).getText();
        String expectedResult = "Your password is invalid!";

    }
    @After
    public void endTest(){
        //closeBrowser();
    }

}
