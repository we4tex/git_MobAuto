package projectTestApp.tests.formsPage;

import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import projectTestApp.base.BaseTest;
import projectTestApp.listeners.AllureListener;

@Listeners(AllureListener.class)
public class CheckSwitchOnTest extends BaseTest {

    public static final String SWITCH_OFF = "Click to turn the switch OFF";

    @Test (priority = 2)
    @Description("Проверяем работу Switch на экране Forms.")
    public void checkSwitchForms() {
        openApp()
                .clickFormsMenuButton()
                .checkFormsSwitchOn(SWITCH_OFF);
    }

}
