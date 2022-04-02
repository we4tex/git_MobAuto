package projectTestApp.tests.swipePage;

import jdk.jfr.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import projectTestApp.base.BaseTest;
import projectTestApp.listeners.AllureListener;

@Listeners(AllureListener.class)
public class CheckLoadTest extends BaseTest {

    @Test
    @Description("Проверяем успешную загрузку экрана Swipe.")
    public void checkLoadSwipe() {
        openApp().clickSwipeMenuButton().checkLoadingSwipePage();
    }

}
