package lesson07.base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.android.AndroidDriver;
import lesson07.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import java.net.MalformedURLException;
import java.net.URL;
import static com.codeborne.selenide.Selenide.close;

public class BaseTest {

    public MainPage openApp() {
        WebDriver driver = null;
        try {
            driver = getAndroidDriver();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.println("Ops, we have problems with URL for driver!");
        }
        WebDriverRunner.setWebDriver(driver);
        return new MainPage();
    }

    public static WebDriver getAndroidDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Pixel_3");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("appium:appPackage", "com.wdiodemoapp");
        capabilities.setCapability("appium:appActivity", "com.wdiodemoapp.MainActivity");
        capabilities.setCapability("appium:noReset", "true");
        Configuration.reportsFolder = "screenshots/actual";
        return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @AfterClass
    public void setDown() {
        close();
    }

}
