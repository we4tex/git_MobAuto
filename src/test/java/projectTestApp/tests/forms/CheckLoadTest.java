package projectTestApp.tests.forms;

import org.testng.annotations.Test;
import projectTestApp.base.BaseTest;

public class CheckLoadFormsTest extends BaseTest {

    public static final String VALID_LOAD_TEXT = "Form components";

    @Test
    public void checkLoadForms () {
        openApp()
                .clickFormsMenuButton()
                .checkFormsLoadText(VALID_LOAD_TEXT);
    }

}
