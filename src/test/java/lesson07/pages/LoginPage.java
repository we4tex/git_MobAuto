package lesson07.pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import lesson07.locators.LoginPageLocators;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private LoginPageLocators locator() {
        return new LoginPageLocators();
    }

    @Step("Проверяем загрузку экрана \"Login\"")
    public LoginPage checkLoginLoadText(String text) {
        $(locator().loginLoadText()).shouldHave(Condition.text(text));
        return new LoginPage();
    }

    @Step("Кликаем по кнопке \"Sign Up\" на экране \"Login\"")
    public LoginPage clickSignUpButton() {
        $(locator().loginSignUpButton()).click();
        return new LoginPage();
    }

    @Step("Проверяем загрузку вкладки регистрации \"Sign Up\" на экране \"Login\"")
    public LoginPage checkLoginSignUpText(String text) {
        $(locator().loginSignUpText()).shouldHave(Condition.text(text));
        return new LoginPage();
    }

    @Step("Кликаем по кнопке \"Login (Forms)\" на экране \"Login\"")
    public LoginPage clickLoginFormsButton() {
        $(locator().loginLoginFormsButton()).click();
        return new LoginPage();
    }

    @Step("Проверяем текст ошибки")
    public LoginPage checkConfirmEmail() {
        $(locator().loginConfirmEmail()).shouldNotBe(Condition.visible);
        return new LoginPage();
    }

}
