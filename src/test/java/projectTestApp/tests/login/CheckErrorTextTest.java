package projectTestApp.tests.login;

import io.qameta.allure.Description;
import projectTestApp.base.BaseTest;
import projectTestApp.listeners.AllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(AllureListener.class)
public class CheckErrorTextTest extends BaseTest {

    public static final String VALID_EMAIL_ADDRESS = "Please enter a valid email address";

    @Test (priority = 2)
    @Description("Проверяем сообщение об ошибке при невалидном email.")
    public void CheckEmptyEmail() {
        openApp()
                .clickLoginMenuButton()
                .clickLoginButton()
                .checkLoginErrorText(VALID_EMAIL_ADDRESS);
    }

}
