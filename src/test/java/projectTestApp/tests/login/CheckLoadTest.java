package projectTestApp.tests.login;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import projectTestApp.base.BaseTest;

public class CheckLoadLoginTest extends BaseTest {

    public static final String VALID_LOAD_TEXT = "Login / Sign up Form";
    @Test
    @Description("Проверяем успешную загрузку экрана Login.")
    public void checkLoadLogin () {
        openApp()
                .clickLoginMenuButton()
                .checkLoginLoadText(VALID_LOAD_TEXT);
    }

}