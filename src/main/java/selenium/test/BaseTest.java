package selenium.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import selenium.factory.BrowserFactory;
import selenium.factory.MainPage;

import java.util.concurrent.TimeUnit;

import static selenium.factory.BrowserFactory.driver;

public class BaseTest {
    MainPage mainPage;
    private BrowserFactory singleton = BrowserFactory.getInstance();


    @BeforeMethod
    public void mainSteps() {
        driver = singleton.getDriverByName("Chrome");
        ijijij();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }

    private void ijijij() {
        mainPage = PageFactory.initElements(driver,MainPage.class);
    }
}
