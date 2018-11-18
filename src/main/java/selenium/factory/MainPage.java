package selenium.factory;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void sdsd() {
        Wait<WebDriver> wait = new WebDriverWait(driver, 10, 1000).ignoring(StaleElementReferenceException.class, ElementNotVisibleException.class);
        driver.navigate().to("https://coursehunters.net/course/selenium-webdriver-java-dlya-nachinayushchih");
        WebElement donateText = driver.findElement(By.xpath("//a[contains(text(),'Donate')]"));
        System.out.println(donateText.getSize());
        System.out.println(donateText.getLocation());
        System.out.println(donateText.getText());
        WebElement menu = driver.findElement(By.cssSelector("label[for='nav-toggle']"));

        wait.until(ExpectedConditions.elementToBeClickable(menu)).click();
        List<WebElement> list = driver.findElements(By.cssSelector("ul[class='menu-aside__ul'] span[itemprop='name']"));
        for (int i = 0; i < list.size(); i++) {
            list.get(i).getText();
        }
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(donateText)).click();
        Assert.assertTrue(driver.getTitle().contains("Поддержать дело Coursehunters.net"));
    }

    public boolean isSelectedRadio() throws InterruptedException {
        driver.get("http://www.echoecho.com/htmlforms10.htm");
//        List<WebElement> radioButtons = driver.findElements(By.cssSelector("td.table8>input[type='radio']"));
//        return radioButtons.get(2).isSelected();
        List<WebElement> radioButtons = driver.findElements(By.cssSelector("td.table5>input[type='radio']"));
        for (int i = 0; i < radioButtons.size(); i++) {
            String radioButtonValue = radioButtons.get(i).getAttribute("value");
            if (radioButtonValue.equalsIgnoreCase("butter")) {
                radioButtons.get(1).isSelected();
            }

        }
       return true;
    }
}
