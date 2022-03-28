package projectTestApp.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class FormsPageLocators {

    public By formsLoadText() {
        return MobileBy.xpath("//android.widget.ScrollView[@content-desc=\"Forms-screen\"]" +
                "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]" +
                "/android.widget.TextView");
    }

    public By formsInputText() {
        return MobileBy.AccessibilityId("text-input");
    }

    public By formsInputTextResult() {
        return MobileBy.AccessibilityId("input-text-result");
    }

    public By formsSwithButton() {
        return MobileBy.AccessibilityId("switch");
    }

    public By formsSwithText() {
        return MobileBy.AccessibilityId("switch-text");
    }

    public By formsDropDownButton() {
        return MobileBy.AccessibilityId("select-Dropdown");
    }

    public By formsDropSelector() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout" +
                "/android.widget.FrameLayout/android.widget.FrameLayout" +
                "/android.widget.LinearLayout/android.widget.FrameLayout" +
                "/android.widget.ListView/android.widget.CheckedTextView[1]");
    }

}
