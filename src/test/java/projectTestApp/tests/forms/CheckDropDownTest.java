package projectTestApp.tests.forms;

import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import projectTestApp.base.BaseTest;
import projectTestApp.listeners.AllureListener;

@Listeners(AllureListener.class)
public class CheckDropDownTest extends BaseTest {

    @Test (priority = 3)
    @Description("Проверяем работу DropDown на экране Forms.")
    public void checkDropDownForms () {
        openApp()
                .clickFormsMenuButton()
                .checkFormsDropDown();
    }

}
