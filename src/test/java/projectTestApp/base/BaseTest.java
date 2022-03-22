package lesson03.base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.android.AndroidDriver;
import lesson03.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

// базовый класс для всех будущих тестов
public class BaseTest {

    // метод, который будет открывать наше приложение на телефоне
    public MainPage openApp() {
        WebDriver driver = null;
        try {
            driver = getAndroidDriver();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.println("Ops, we have problems with URL for driver!");
        }
// устанавливаем драйвер для selenide
        WebDriverRunner.setWebDriver(driver);
// возвращаем главную страницу для будущей работы с ней в тесте
        return new MainPage();
    }
    public static WebDriver getAndroidDriver() throws MalformedURLException {
// устанавливаем capabilities
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Pixel_3");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("udid", "emulator-5554");
//        для предустановки приложения
//        capabilities.setCapability("automationName", "UiAutomator2");
//        capabilities.setCapability("app",
//                "/Users/v.shekhavtsov/Downloads/Android-NativeDemoApp-0.2.1.apk");
        capabilities.setCapability("appium:appPackage", "com.wdiodemoapp");
        capabilities.setCapability("appium:appActivity", "com.wdiodemoapp.MainActivity");
        capabilities.setCapability("appium:noReset", "true");
// папка для сохранения скриншотов selenide
        Configuration.reportsFolder = "screenshots/actual";
// устанавливаем и открываем приложение
        return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

}
