package lesson02;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class InputTextFormApp {

    @Test
    public void checkInputText () throws InterruptedException, MalformedURLException {

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
        MobileElement formMenuButton = (MobileElement)
                driver.findElementByXPath
                        ("//android.view.ViewGroup[@content-desc=\"Forms\"]/android.view.ViewGroup");
        formMenuButton.click();
        Thread.sleep(2000);
        MobileElement inputText = (MobileElement) driver.findElementByAccessibilityId("text-input");
        inputText.sendKeys("test");
        MobileElement checkText = (MobileElement)
                driver.findElementByAccessibilityId("input-text-result");
        Assert.assertEquals(checkText.getText(), "test");

    }

}
