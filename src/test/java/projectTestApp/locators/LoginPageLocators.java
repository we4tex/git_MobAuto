package lesson03.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

// Класс с локаторами страницы логина.
public class LoginPageLocators {

    public By loginButton() {
        return MobileBy.AccessibilityId("button-LOGIN");
    }
    public By loginErrorText() {
        return MobileBy.xpath("//android.widget.ScrollView[@content-desc=\"Login-screen\"]" +
                "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]" +
                "/android.widget.TextView[1]");
    }

}
