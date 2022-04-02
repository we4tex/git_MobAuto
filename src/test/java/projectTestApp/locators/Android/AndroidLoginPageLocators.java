package projectTestApp.locators.Android;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import projectTestApp.locators.interfaces.LoginPageLocators;

public class AndroidLoginPageLocators implements LoginPageLocators {
    @Override
    public By loginButton() {
        return MobileBy.AccessibilityId("button-LOGIN");
    }

    @Override
    public By loginErrorText() {
        return MobileBy.xpath("//android.widget.ScrollView[@content-desc=\"Login-screen\"]" +
                "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]" +
                "/android.widget.TextView[1]");
    }

    @Override
    public By loginLoadText() {
        return MobileBy.xpath("//android.widget.ScrollView[@content-desc=\"Login-screen\"]" +
                "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]" +
                "/android.widget.TextView");
    }

    @Override
    public By loginSignUpButton() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"button-sign-up-container\"]" +
                "/android.view.ViewGroup/android.widget.TextView");
    }

    @Override
    public By loginSignUpText() {
        return MobileBy.AccessibilityId("input-repeat-password");
    }
}
