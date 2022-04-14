package lesson07.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lesson07.base.BaseTest;
import lesson07.pages.LoginPage;

public class LoginPageSteps extends BaseTest {

    LoginPage loginPage = new LoginPage();
    public static final String VALID_LOAD_TEXT = "Login / Sign up Form";
    public static final String VALID_TEXT = "Confirm password";

    @Given("^User open App and tab Login Page$")
    public void userOpenAppAndTab() {
        openApp().clickLoginMenuButton();
    }

    @Then("Check correct loading Login Page")
    public void checkCorrectLoading() {
        loginPage.checkLoginLoadText(VALID_LOAD_TEXT);
    }

    @When("User clicks on tab Sign Up")
    public void userClicksOnTabSignUp() {
        loginPage.clickSignUpButton();
    }

    @Then("Check correct loading Sign Up")
    public void checkCorrectLoadingSignUp() {
        loginPage.checkLoginSignUpText(VALID_TEXT);
    }

    @When("User clicks on tab Login forms")
    public void userClicksOnTabLoginForms() {
        loginPage.clickLoginFormsButton();
    }

    @Then("Check correct loading login forms")
    public void checkCorrectErrorText() {
        loginPage.checkConfirmEmail();
    }

}
