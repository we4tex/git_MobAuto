package projectTestApp.tests.LoadingApp;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import projectTestApp.base.BaseLoadTest;

public class CheckLoadAppTest extends BaseLoadTest {

    public static final String VALID_LOAD_TEXT = "WEBDRIVER";
    @Test
    @Description("Проверяем установку и открытие APP по тексту на главном экране.")
    public void checkLoadApp() {
        openApp()
                .checkLoadApp(VALID_LOAD_TEXT);
    }

}
