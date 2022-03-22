package projectTestApp.tests.main;

import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import projectTestApp.base.BaseTest;
import org.testng.annotations.Test;
import projectTestApp.listeners.AllureListener;

@Listeners(AllureListener.class)
public class CheckFailScreenshotTest extends BaseTest {

    @Test (priority = 2)
    @Description("Проверяем поведение теста при неудачной проверке UI главной страницы с помощью скриншота.")
    public void CheckFailMainPageScreenshot() {
        openApp()
                .checkFailScreenshot();
    }

}
