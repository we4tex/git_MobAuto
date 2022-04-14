package lesson07.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class MainPageLocators {

    public By loginButton() {
        return MobileBy.AccessibilityId("Login");
    }

    public By loadAppText() {
        return MobileBy.xpath("//android.widget.ScrollView[@content-desc=\"Home-screen\"]" +
                "/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[1]");
    }

}
