package projectTestApp.locators;

import projectTestApp.locators.Android.*;
import projectTestApp.locators.IOS.*;
import projectTestApp.locators.interfaces.*;

public class LocatorService {

    public static final MainPageLocators MAIN_PAGE_LOCATORS =
            System.getProperty("platform").equals("Android")
                    ? new AndroidMainPageLocators() : new IOSMainPageLocators();

    public static final LoginPageLocators LOGIN_PAGE_LOCATORS =
            System.getProperty("platform").equals("Android")
                    ? new AndroidLoginPageLocators() : new IOSLoginPageLocators();

    public static final FormsPageLocators FORMS_PAGE_LOCATORS =
            System.getProperty("platform").equals("Android")
                    ? new AndroidFormsPageLocators() : new IOSFormsPageLocators();

    public static final SwipePageLocators SWIPE_PAGE_LOCATORS =
            System.getProperty("platform").equals("Android")
                    ? new AndroidSwipePageLocators() : new IOSSwipePageLocators();

}
