package projectTestApp.tests.forms;

import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import projectTestApp.base.BaseTest;
import projectTestApp.listeners.AllureListener;

@Listeners(AllureListener.class)
public class CheckInputTest extends BaseTest {

    public static final String VALID_INPUT_TEXT = "testing";

    @Test (priority = 1)
    @Description("Проверяем успешную ввод текста на экране Forms.")
    public void checkInputForms () {
        openApp()
                .clickFormsMenuButton()
                .checkFormsInputText(VALID_INPUT_TEXT);
    }

}
