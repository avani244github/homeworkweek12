package automationexercise;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TestClass8 extends BaseClass{
    String baseUrl = "http://automationexercise.com";

    @Before
    public void browserOpen() {
        openBrowser(baseUrl);
    }
    @Test
    public void verifyAllProductsandProductDetailPage(){
        boolean result = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).isEnabled(); //Verify that home page is visible successfully
        System.out.println(result);
        driver.findElement(By.xpath("//div[@class='col-sm-8']/div/ul/li[2]/a")).click(); // Click on 'Products' button
        String actualResult = driver.findElement(By.xpath("//div[@class='features_items']/h2")).getText();
        System.out.println(actualResult);
        String expectedResult = "ALL PRODUCTS";
       Assert.assertEquals(actualResult,expectedResult); //Verify user is navigated to ALL PRODUCTS page successfully

        boolean result1 = driver.findElement(By.xpath("//div[@class='features_items']/div[2]")).isEnabled(); //Verify that home page is visible successfully
        System.out.println(result1); //The products list is visible

        driver.findElement(By.xpath("//div[@class='features_items']/div[2]/div/div[2]/ul/li")).click(); //Click on 'View Product' of first product

        boolean result2 = driver.findElement(By.xpath("//div[@class='product-details']/div[2]/div")).isEnabled();
        System.out.println(result2);  //User is landed to product detail page

        driver.findElement(By.xpath("//div[@class='product-details']/div[2]/div/h2")).getText(); //product name
        driver.findElement(By.xpath("//div[@class='product-details']/div[2]/div/p")).getText(); //category
        driver.findElement(By.xpath("//div[@class='product-details']/div[2]/div/span/span")).getText(); //price
        driver.findElement(By.xpath("//div[@class='product-details']/div[2]/div/p[2]")).getText(); //availability
        driver.findElement(By.xpath("//div[@class='product-details']/div[2]/div/p[3]")).getText(); //condition
        driver.findElement(By.xpath("//div[@class='product-details']/div[2]/div/p[4]")).getText(); //brand
        // Verify that detail is visible: product name, category, price, availability, condition, brand


    }

    @After
        public void endTest() {
            //closeBrowser();
        }
}
