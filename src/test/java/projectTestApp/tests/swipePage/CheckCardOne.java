package projectTestApp.tests.swipePage;

import jdk.jfr.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import projectTestApp.base.BaseTest;
import projectTestApp.listeners.AllureListener;

@Listeners(AllureListener.class)
public class CheckCardOne extends BaseTest {

    @Test (priority = 1)
    @Description("Проверяем успешное отображение 1-й карточки в карусели")
    public void checkVisibleCardOne () {
        openApp().clickSwipeMenuButton().checkAvailibaleCardOne();
    }

}
