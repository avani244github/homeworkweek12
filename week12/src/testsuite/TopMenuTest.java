package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setup(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul/li[1]/a")).click();
        String actualResult=driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul/li[1]/a")).getText();
        String expectedResualt="Computers";
        assertEquals(actualResult,expectedResualt);
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]/li[2]/a")).click();
        String actualResult=driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]/li[2]/a")).getText();
        String expectedResualt="Electronics";
        assertEquals(actualResult,expectedResualt);
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfull(){
        driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]/li[3]/a")).click();
        String actualresult=driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]/li[3]/a")).getText();
        String expectedresult="Apparel";
        assertEquals(actualresult,expectedresult);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfull(){
        driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]/li[4]/a")).click();
        String actualResult1 = driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]/li[4]/a")).getText();
        System.out.println(actualResult1);
       String expectedResult1= "Digital downloads";
      Assert.assertEquals(actualResult1,expectedResult1);

    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]/li[5]/a")).click();
        String actualResult = driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]/li[5]/a")).getText();
        String expectedResult = "Books";
        assertEquals(actualResult,expectedResult);
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]/li[6]/a")).click();
        String actualResult = driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]/li[6]/a")).getText();
        String expectedResult = "Jewelry";
        assertEquals(actualResult,expectedResult);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfull(){
        driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]/li[7]/a")).click();
        String actualResult = driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]/li[7]/a")).getText();
        String expectedResult ="Gift Cards";
        assertEquals(actualResult,expectedResult);
    }

    @After
    public void browserClose(){
        //closeBrowser();
    }

}
