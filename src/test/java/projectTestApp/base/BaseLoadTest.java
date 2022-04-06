package projectTestApp.base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import projectTestApp.pages.MainPage;
import java.net.MalformedURLException;
import java.net.URL;
import static com.codeborne.selenide.Selenide.close;


public class BaseLoadTest {

    public MainPage openApp() {
        WebDriver driver = null;
        try {
            driver = getAppiumDriver();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.println("Ops, we have problems with URL for driver!");
        }
        WebDriverRunner.setWebDriver(driver);
        return new MainPage();
    }

    public static WebDriver getAppiumDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        switch (System.getProperty("platform")) {
            case "Android" -> {
                capabilities.setCapability("platformName", "Android");
                capabilities.setCapability("deviceName", "Pixel_3");
                capabilities.setCapability("platformVersion", "10");
                capabilities.setCapability("udid", "emulator-5554");
                capabilities.setCapability("automationName", "UiAutomator2");
                capabilities.setCapability("app",
                        "/home/we4tex/Appium/Downloads/Android-NativeDemoApp-0.2.1.apk");
            }
            case "IOS" -> {
                capabilities.setCapability("platformName", "iOS");
                capabilities.setCapability("deviceName", "iPhone");
                capabilities.setCapability("platformVersion", "15");
                capabilities.setCapability("udid", "NONE");
                capabilities.setCapability("automationName", "XCUITest");
                capabilities.setCapability("app", "NONE");
            }
        }

        Configuration.reportsFolder = "screenshots/actual";
        return new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @AfterClass
    public void setDown() {
        close();
    }

}
