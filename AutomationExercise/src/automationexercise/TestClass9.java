package automationexercise;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TestClass9 extends BaseClass{
    String baseUrl = "http://automationexercise.com";

    @Before
    public void browserOpen() {
        openBrowser(baseUrl);
    }
    @Test
    public void searchProduct(){
        boolean result = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).isEnabled(); //Verify that home page is visible successfully
        System.out.println(result);
        driver.findElement(By.xpath("//div[@class='col-sm-8']/div/ul/li[2]/a")).click(); // Click on 'Products' button
        String actualResult = driver.findElement(By.xpath("//div[@class='features_items']/h2")).getText();
        System.out.println(actualResult);
        String expectedResult = "ALL PRODUCTS";
        Assert.assertEquals(actualResult,expectedResult); //Verify user is navigated to ALL PRODUCTS page successfully
driver.findElement(By.xpath("//section[@id='advertisement']/div/input")).sendKeys("saree"); //Enter product name in search input and click search button
        driver.findElement(By.xpath("//section[@id='advertisement']/div/button")).click();//click on search button

driver.findElement(By.className("features_items")).getText(); // Verify 'SEARCHED PRODUCTS' is visible
driver.findElement(By.className("features_items")).getText(); // Verify all the products related to search are visible

    }
    @After
    public void endTest() {
        //closeBrowser();
    }

}
