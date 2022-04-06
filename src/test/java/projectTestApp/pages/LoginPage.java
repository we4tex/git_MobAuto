package projectTestApp.pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import projectTestApp.locators.LocatorService;
import projectTestApp.locators.interfaces.LoginPageLocators;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {


    private LoginPageLocators locator() {
        return LocatorService.LOGIN_PAGE_LOCATORS;
    }

    @Step("Кликаем по кнопке \"Login\" на экране \"Login\"")
    public LoginPage clickLoginButton() {
        $(locator().loginButton()).click();
        return new LoginPage();
    }

    @Step("Кликаем по кнопке \"Sign Up\" на экране \"Login\"")
    public LoginPage clickSignUpButton() {
        $(locator().loginSignUpButton()).click();
        return new LoginPage();
    }

    @Step("Проверяем текст ошибки")
    public LoginPage checkLoginErrorText(String text) {
        $(locator().loginErrorText()).shouldHave(Condition.text(text));
        return new LoginPage();
    }

    @Step("Проверяем загрузку экрана \"Login\"")
    public LoginPage checkLoginLoadText(String text) {
        $(locator().loginLoadText()).shouldHave(Condition.text(text));
        return new LoginPage();
    }
    @Step("Проверяем загрузку вкладки регистрации \"Sign Up\" на экране \"Login\"")
    public LoginPage checkLoginSignUpText(String text) {
        $(locator().loginSignUpText()).shouldHave(Condition.text(text));
        return new LoginPage();
    }

}
