package projectTestApp.tests.loadingApp;

import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import projectTestApp.base.BaseLoadTest;
import projectTestApp.listeners.AllureListener;

@Listeners(AllureListener.class)
public class CheckLoadAppTest extends BaseLoadTest {

    @Test
    @Description("Проверяем установку и открытие APP по тексту на главном экране.")
    public void checkLoadApp() {
        openApp()
                .checkLoadApp();
    }

}
