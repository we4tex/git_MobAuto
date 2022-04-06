package projectTestApp.pages;

import com.codeborne.selenide.Condition;
import com.github.romankh3.image.comparison.ImageComparison;
import com.github.romankh3.image.comparison.ImageComparisonUtil;
import com.github.romankh3.image.comparison.model.ImageComparisonResult;
import com.github.romankh3.image.comparison.model.ImageComparisonState;
import io.qameta.allure.Step;
import projectTestApp.locators.LocatorService;
import projectTestApp.locators.interfaces.MainPageLocators;

import java.awt.image.BufferedImage;
import java.io.File;
import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertEquals;

public class MainPage {

    private MainPageLocators locator() {
        return LocatorService.MAIN_PAGE_LOCATORS;
    }

    @Step("Кликаем по кнопке \"Login\" в меню и переходим на новый экран \"Login\"")
    public LoginPage clickLoginMenuButton() {
        $(locator().loginButton()).click();
        return new LoginPage();
    }

    @Step("Кликаем по кнопке Forms в меню и переходим на новый экран Forms")
    public FormsPage clickFormsMenuButton() {
        $(locator().formsButton()).click();
        return new FormsPage();
    }

    @Step("Кликаем по кнопке Swipe в меню и переходим на новый экран Swipe")
    public SwipePage clickSwipeMenuButton() {
        $(locator().swithButton()).click();
        return new SwipePage();
    }

    @Step("Находим элемент на главном экране по тексту")
    public void checkLoadApp() {
        $(locator().loadAppText()).shouldBe(Condition.visible);
        new MainPage();
    }

    @Step("Делаем скриншот главной страницы и сравниваем с требованием.")
    public MainPage checkScreenshot() {
        BufferedImage expectedImage = ImageComparisonUtil
                .readImageFromResources("src/main/resources/expectedScreenshots/mainPage.png");
        File actualScreenshot = $(locator().homeScreen()).screenshot();
        BufferedImage actualImage = ImageComparisonUtil
                .readImageFromResources("screenshots/actual/" + actualScreenshot.getName());
        File resultDestination = new File("diff/diff_CheckMainPageScreenshot.png");
        ImageComparisonResult imageComparisonResult = new ImageComparison(expectedImage,
                actualImage, resultDestination).compareImages();
        assertEquals(ImageComparisonState.MATCH, imageComparisonResult.getImageComparisonState());
        return this;
    }

    @Step("Делаем проверку падения теста по скриншоту.")
    public MainPage checkFailScreenshot() {
        BufferedImage expectedImage = ImageComparisonUtil
                .readImageFromResources("src/main/resources/expectedScreenshots/failTest.png");
        File actualScreenshot = $(locator().homeScreen()).screenshot();
        BufferedImage actualImage = ImageComparisonUtil
                .readImageFromResources("screenshots/actual/" + actualScreenshot.getName());
        File resultDestination = new File("diff/diff_CheckFailMainPageScreenshot.png");
        ImageComparisonResult imageComparisonResult = new ImageComparison(expectedImage,
                actualImage, resultDestination).compareImages();
        assertEquals(ImageComparisonState.MATCH,
                imageComparisonResult.getImageComparisonState());
        return this;
    }

}
