package projectTestApp.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import projectTestApp.locators.LoginPageLocators;

public class LoginPage {


    private LoginPageLocators locator() {
        return new LoginPageLocators();
    }

    @Step("Кликаем по кнопке \"Login\" на экране \"Login\"")
    public LoginPage clickLoginButton() {
        Selenide.$(locator().loginButton()).click();
        return new LoginPage();
    }

    @Step("Кликаем по кнопке \"Sign Up\" на экране \"Login\"")
    public LoginPage clickSignUpButton() {
        Selenide.$(locator().loginSignUpButton()).click();
        return new LoginPage();
    }

    @Step("Проверяем текст ошибки")
    public LoginPage checkLoginErrorText(String text) {
        Selenide.$(locator().loginErrorText()).shouldHave(Condition.text(text));
        return new LoginPage();
    }

    @Step("Проверяем загрузку экрана \"Login\"")
    public LoginPage checkLoginLoadText(String text) {
        Selenide.$(locator().loginLoadText()).shouldHave(Condition.text(text));
        return new LoginPage();
    }
    @Step("Проверяем загрузку вкладки регистрации \"Sign Up\" на экране \"Login\"")
    public LoginPage checkLoginSignUpText(String text) {
        Selenide.$(locator().loginSignUpText()).shouldHave(Condition.text(text));
        return new LoginPage();
    }

}
