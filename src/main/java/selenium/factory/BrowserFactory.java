package selenium.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static selenium.factory.DriverCapabilities.chromeCapabilities;

public final class BrowserFactory implements DriverCapabilities {
    private static volatile BrowserFactory instance;
    public static WebDriver driver;
    private static final String CHROME = "Chrome";
    private static final String FIREFOX = "Firefox";

    public static BrowserFactory getInstance() {
        if (instance == null) {
            synchronized (BrowserFactory.class) {
                if (instance == null) {
                    instance = new BrowserFactory();
                }
            }
        }
        return instance;
    }

    public WebDriver getDriverByName(String browserName) {
//        driver = null;
        if (browserName.equals(CHROME)) {
            System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
            driver = new ChromeDriver(chromeCapabilities());
        } else if (browserName.equals(FIREFOX)) {
            System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
            driver = new FirefoxDriver(firefoxCapabilities());
        }
//        return driver;
//        String driverName = browserName;
//        switch (driverName) {
//            case CHROME:
//                System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
//                driver = new ChromeDriver(chromeCapabilities());
//                break;
//            case FIREFOX:
//                System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
//                driver = new FirefoxDriver(firefoxCapabilities());
//                break;
//            default:
//                System.out.println("INCORRECT DRIVER!!!!!!!!!!!!!!!!!!!!!!!");
//        }


        return driver;
    }
}