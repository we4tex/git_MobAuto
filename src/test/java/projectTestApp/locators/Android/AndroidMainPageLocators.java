package projectTestApp.locators.Android;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import projectTestApp.locators.interfaces.MainPageLocators;

public class AndroidMainPageLocators implements MainPageLocators {
    @Override
    public By loginButton() {
        return MobileBy.AccessibilityId("Login");
    }

    @Override
    public By formsButton() {
        return MobileBy.AccessibilityId("Forms");
    }

    @Override
    public By homeScreen() {
        return MobileBy.AccessibilityId("Home-screen");
    }

    @Override
    public By loadAppText() {
        return MobileBy.xpath("//android.widget.ScrollView[@content-desc=\"Home-screen\"]" +
                "/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[1]");
    }

    @Override
    public By swithButton() {
        return MobileBy.AccessibilityId("Swipe");
    }
}
