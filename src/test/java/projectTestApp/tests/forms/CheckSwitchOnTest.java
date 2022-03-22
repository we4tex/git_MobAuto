package projectTestApp.tests.forms;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import projectTestApp.base.BaseTest;

public class CheckSwitchOffTest extends BaseTest {

    public static final String SWITCH_OFF = "Click to turn the switch OFF";

    @Test
    @Description("Проверяем работу Switch на экране Forms.")
    public void checkSwitchForms() {
        openApp()
                .clickFormsMenuButton()
                .checkFormsSwitchOff(SWITCH_OFF);
    }

}
