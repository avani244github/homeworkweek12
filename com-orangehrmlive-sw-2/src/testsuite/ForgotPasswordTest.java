package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);

    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        driver.findElement(By.xpath("//div[@class='orangehrm-login-form']/form/div[4]/p")).click();
        String actualResult= driver.findElement(By.xpath("//div[@class='orangehrm-card-container']/form/h6")).getText();
        String expectedresult = "Reset Password";
    }

    @After
    public void endTest() {
        // closeBrowser();
    }
}
