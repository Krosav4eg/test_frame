package selenium.test;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static selenium.factory.BrowserFactory.driver;

public class TestRunner extends BaseTest {


    @Test(invocationCount = 1)
    public void verifyCopyWritingTest() throws InterruptedException {
        mainPage.isSelectedRadio();
    }
//    @Test(invocationCount = 1)
//    public void verifyCopyWritingTest1() {
//        Wait<WebDriver> wait = new WebDriverWait(driver, 10, 1000).ignoring(StaleElementReferenceException.class, ElementNotVisibleException.class);
//        driver.navigate().to("https://coursehunters.net/course/selenium-webdriver-java-dlya-nachinayushchih");
//        WebElement donateText = driver.findElement(By.xpath("//a[contains(text(),'Donate')]"));
//        System.out.println(donateText.getSize());
//        System.out.println(donateText.getLocation());
//        System.out.println(donateText.getText());
//    }
}