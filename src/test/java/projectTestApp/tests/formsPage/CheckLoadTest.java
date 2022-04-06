package projectTestApp.tests.formsPage;

import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import projectTestApp.base.BaseTest;
import projectTestApp.listeners.AllureListener;

@Listeners(AllureListener.class)
public class CheckLoadTest extends BaseTest {

    public static final String VALID_LOAD_TEXT = "Form components";

    @Test
    @Description("Проверяем успешную загрузку экрана Forms.")
    public void checkLoadForms () {
        openApp()
                .clickFormsMenuButton()
                .checkFormsLoadText(VALID_LOAD_TEXT);
    }

}
