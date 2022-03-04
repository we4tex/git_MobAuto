package lesson02;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class LaunchApp {

    @Test
    public void checkLaunchApp () throws MalformedURLException, InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Pixel_3");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("appPackage", "com.wdiodemoapp");
        capabilities.setCapability("appActivity","com.wdiodemoapp.MainActivity");
        capabilities.setCapability("noReset", true);
        MobileDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        Thread.sleep(2000);
        MobileElement checkText = (MobileElement)
                driver.findElementByXPath("//android.widget.ScrollView[@content-desc=\"Home-screen\"]" +
                        "/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[1]");
        Assert.assertEquals(checkText.getText(), "WEBDRIVER");

    }

}
