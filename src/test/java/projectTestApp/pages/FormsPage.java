package projectTestApp.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import projectTestApp.locators.FormsPageLocators;

public class FormsPage {

    private FormsPageLocators locator() {
        return new FormsPageLocators();
    }

    @Step("Проверяем загрузку экрана Forms")
    public FormsPage checkFormsLoadText(String text) {
        Selenide.$(locator().formsLoadText()).shouldHave(Condition.text(text));
        return new FormsPage();
    }

    @Step("Проверяем поле input на экране Forms")
    public FormsPage checkFormsInputText(String text) {
        Selenide.$(locator().formsInputText()).sendKeys("testing");
        Selenide.$(locator().formsInputTextResult()).shouldHave(Condition.text(text));
        return new FormsPage();
    }

    @Step("Проверяем кнопку Switch на экране Forms")
    public FormsPage checkFormsSwitchOn(String text) {
            Selenide.$(locator().formsSwithButton()).click();
            Selenide.$(locator().formsSwithText()).shouldHave(Condition.text(text));
            return new FormsPage();
    }

    @Step("Проверяем кнопку DropDown на экране Forms")
    public FormsPage checkFormsDropDown() {
        Selenide.$(locator().formsDropDownButton()).click();
        Selenide.$(locator().formsDropSelector()).shouldBe(Condition.visible);
        return new FormsPage();
    }

}
