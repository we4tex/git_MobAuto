package projectTestApp.tests.main;

import io.qameta.allure.Description;
import projectTestApp.base.BaseTest;
import projectTestApp.listeners.AllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(AllureListener.class)
public class CheckScreenshotTest extends BaseTest {

    @Test (priority = 1)
    @Description("Проверяем UI главной страницы с помощью скриншота.")
    public void CheckMainPageScreenshot() {
        openApp()
                .checkScreenshot();
    }

}
