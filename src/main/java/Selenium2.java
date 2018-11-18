import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.sql.SQLOutput;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Selenium2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Krosav4eg\\IdeaProjects\\Potapium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://coursehunters.net/course/selenium-webdriver-java-dlya-nachinayushchih");
        WebElement menu = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("label[for=\"nav-toggle\"]")));
        menu.click();
        Thread.sleep(2000);
        List<WebElement> list = driver.findElements(By.cssSelector(".menu-aside__li"));
        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).getText());
//            System.out.println(list.get(i).getCssValue("color"));
            if (list.get(i).getText().contains("Front")) {
                list.get(i).click();
            }
            else{
                System.out.println("sdsdsd#@%^*&(IUYTFDGHKJHGFDGHJ");
            }
        }
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().startsWith("Selenium"));
        driver.quit();
    }
}
