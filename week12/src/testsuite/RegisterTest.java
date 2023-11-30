package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);

    }

    @Test
    public void UserShouldNavigateToRegisterPageSuccessfully() {
        driver.findElement(By.xpath("//div[@class='header-upper']/div[2]/div[1]/ul/li[1]/a")).click();
        String actualResult = driver.findElement(By.xpath("//div[@class='header-upper']/div[2]/div[1]/ul/li[1]/a")).getText();
        String exprctedresult = "Register";
        Assert.assertEquals(actualResult,exprctedresult);//click and verify on the ‘Register’

    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){
        driver.findElement(By.xpath("//div[@class='header-upper']/div[2]/div[1]/ul/li[1]/a")).click();
        String actualResult = driver.findElement(By.xpath("//div[@class='header-upper']/div[2]/div[1]/ul/li[1]/a")).getText();
        String exprctedresult = "Register";
        Assert.assertEquals(actualResult,exprctedresult);//click and verify on the ‘Register’

       WebElement genderRadioButton = driver.findElement(By.xpath("//div[@class='page registration-page']/div[2]/form/div[1]/div[2]/div[1]/div/span[2]/input"));
        genderRadioButton.click(); // Select gender radio button

        WebElement firstName = driver.findElement(By.xpath("//div[@class='page registration-page']/div[2]/form/div[1]/div[2]/div[2]/input"));
        firstName.sendKeys("Avani");

        WebElement lastName = driver.findElement(By.xpath("//div[@class='page registration-page']/div[2]/form/div[1]/div[2]/div[3]/input"));
        lastName.sendKeys("Patel");

        WebElement emailAddress = driver.findElement(By.xpath("//div[@class='page registration-page']/div[2]/form/div[1]/div[2]/div[5]/input"));
        emailAddress.sendKeys("Patelavani24@gmail.com");

        WebElement password = driver.findElement(By.xpath("//div[@class='page registration-page']/div[2]/form/div[4]/div[2]/div[1]/input"));
        password.sendKeys("23233434");

        WebElement confirmPassword = driver.findElement(By.xpath("//div[@class='page registration-page']/div[2]/form/div[4]/div[2]/div[2]/input"));
        confirmPassword.sendKeys("23233434");

        WebElement registerButton = driver.findElement(By.xpath("//div[@class='page registration-page']/div[2]/form/div[5]/button"));
        registerButton.click();


        String actualResult1 = driver.findElement(By.className("result")).getText();
        String expectedResult1 = "Your registration completed";
        Assert.assertEquals(actualResult1,expectedResult1);






    }


    @After
    public void endTest() {
        //closeBrowser();

    }
}
