package projectTestApp.tests.loginPage;

import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import projectTestApp.base.BaseTest;
import projectTestApp.listeners.AllureListener;

@Listeners(AllureListener.class)
public class CheckSignUpTest extends BaseTest {

    public static final String VALID_TEXT = "Confirm password";

    @Test (priority = 1)
    @Description("Проверяем успешную загрузку регистрации на экране Login.")
    public void checkSignUpLogin () {
        openApp()
                .clickLoginMenuButton()
                .clickSignUpButton()
                .checkLoginSignUpText(VALID_TEXT);
    }

}
