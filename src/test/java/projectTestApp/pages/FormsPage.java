package projectTestApp.pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import projectTestApp.locators.LocatorService;
import projectTestApp.locators.interfaces.FormsPageLocators;

import static com.codeborne.selenide.Selenide.$;

public class FormsPage {

    private FormsPageLocators locator() {
        return LocatorService.FORMS_PAGE_LOCATORS;
    }

    @Step("Проверяем загрузку экрана Forms")
    public FormsPage checkFormsLoadText(String text) {
        $(locator().formsLoadText()).shouldHave(Condition.text(text));
        return new FormsPage();
    }

    @Step("Проверяем поле input на экране Forms")
    public FormsPage checkFormsInputText(String text) {
        $(locator().formsInputText()).sendKeys("testing");
        $(locator().formsInputTextResult()).shouldHave(Condition.text(text));
        return new FormsPage();
    }

    @Step("Проверяем кнопку Switch на экране Forms")
    public FormsPage checkFormsSwitchOn(String text) {
            $(locator().formsSwithButton()).click();
            $(locator().formsSwithText()).shouldHave(Condition.text(text));
            return new FormsPage();
    }

    @Step("Проверяем кнопку DropDown на экране Forms")
    public FormsPage checkFormsDropDown() {
        $(locator().formsDropDownButton()).click();
        $(locator().formsDropSelector()).shouldBe(Condition.visible);
        return new FormsPage();
    }

}
