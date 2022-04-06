package lesson07.pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import lesson07.locators.MainPageLocators;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private MainPageLocators locator() {
        return new MainPageLocators();
    }

    @Step("Кликаем по кнопке \"Login\" в меню и переходим на новый экран \"Login\"")
    public LoginPage clickLoginMenuButton() {
        $(locator().loginButton()).click();
        return new LoginPage();
    }

    @Step("Находим элемент на главном экране по тексту")
    public void checkLoadApp() {
        $(locator().loadAppText()).shouldBe(Condition.visible);
        new MainPage();
    }

}
