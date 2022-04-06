package projectTestApp.tests.swipePage;

import jdk.jfr.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import projectTestApp.base.BaseTest;
import projectTestApp.listeners.AllureListener;

@Listeners(AllureListener.class)
public class CheckTitleCardOne extends BaseTest {

    public static final String VALID_TITLE_TEXT = "FULLY OPEN SOURCE";

    @Test (priority = 2)
    @Description("Проверяем Title первой карточки")
    public void checkTitleCardOne () {
        openApp().clickSwipeMenuButton().checkTitleCardOne(VALID_TITLE_TEXT);
    }

}
