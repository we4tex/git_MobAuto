package projectTestApp.pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import projectTestApp.locators.LocatorService;
import projectTestApp.locators.interfaces.SwipePageLocators;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SwipePage {

    private SwipePageLocators locator() {
        return LocatorService.SWIPE_PAGE_LOCATORS;
    }

    @Step("Проверяем загрузку экрана Switch")
    public SwipePage checkLoadingSwipePage () {
        $(locator().swipeScreen()).shouldBe(Condition.enabled);
        return new SwipePage();
    }

    @Step("Проверяем отображение первой карточки в карусели")
    public SwipePage checkAvailibaleCardOne () {
        $(locator().cardOne()).shouldBe(visible);
        return new SwipePage();
    }

    @Step("Проверяем Title первой карточки")
    public SwipePage checkTitleCardOne (String text) {
        $(locator().titleCardOne()).shouldHave(Condition.text(text));
        return new SwipePage();
    }

}
