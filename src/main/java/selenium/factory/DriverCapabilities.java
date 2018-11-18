package selenium.factory;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public interface DriverCapabilities {

    static Capabilities chromeCapabilities() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
//        options.addArguments("--headless");
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        capability.setBrowserName("chrome");
        capability.setPlatform(Platform.ANY);
        capability.setCapability(ChromeOptions.CAPABILITY, options);
        return capability;
    }

    default Capabilities firefoxCapabilities() {
        DesiredCapabilities capability = DesiredCapabilities.firefox();
        FirefoxProfile profile = new FirefoxProfile();
        profile.setAcceptUntrustedCertificates(true);
        profile.setAssumeUntrustedCertificateIssuer(true);
        capability.setCapability(FirefoxDriver.PROFILE, profile);
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("start-maximized");
        capability.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
        return capability;
    }
}