package projectTestApp.locators.Android;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import projectTestApp.locators.interfaces.FormsPageLocators;

public class AndroidFormsPageLocators implements FormsPageLocators {
    @Override
    public By formsLoadText() {
        return MobileBy.xpath("//android.widget.ScrollView[@content-desc=\"Forms-screen\"]" +
                "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]" +
                "/android.widget.TextView");
    }

    @Override
    public By formsInputText() {
        return MobileBy.AccessibilityId("text-input");
    }

    @Override
    public By formsInputTextResult() {
        return MobileBy.AccessibilityId("input-text-result");
    }

    @Override
    public By formsSwithButton() {
        return MobileBy.AccessibilityId("switch");
    }

    @Override
    public By formsSwithText() {
        return MobileBy.AccessibilityId("switch-text");
    }

    @Override
    public By formsDropDownButton() {
        return MobileBy.AccessibilityId("select-Dropdown");
    }

    @Override
    public By formsDropSelector() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout" +
                "/android.widget.FrameLayout/android.widget.FrameLayout" +
                "/android.widget.LinearLayout/android.widget.FrameLayout" +
                "/android.widget.ListView/android.widget.CheckedTextView[1]");
    }
}
