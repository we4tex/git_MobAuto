package projectTestApp.locators.Android;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import projectTestApp.locators.interfaces.SwipePageLocators;

public class AndroidSwipePageLocators implements SwipePageLocators {

    @Override
    public By swipeScreen() {
        return MobileBy.AccessibilityId("Swipe-screen");
    }

    @Override
    public By cardOne() {
        return MobileBy.xpath("(//android.view.ViewGroup[@content-desc=\"card\"])[1]");
    }

    @Override
    public By titleCardOne() {
        return MobileBy.xpath("(//android.view.ViewGroup[@content-desc=\"card\"])[1]/android.widget.TextView[2]");
    }

    @Override
    public By cardTwo() {
        return MobileBy.xpath("(//android.view.ViewGroup[@content-desc=\"card\"])[2]");
    }

    @Override
    public By titleCardTwo() {
        return MobileBy.xpath("(//android.view.ViewGroup[@content-desc=\"card\"])[2]/android.widget.TextView[2]");
    }
}
