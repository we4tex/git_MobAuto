package lesson07.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lesson07.base.BaseTest;

public class LoadingSteps extends BaseTest {

    @Given("Start this test")
    public void startThisTest() {
        System.out.println("Cucumber start Loading App Test :)");
    }

    @Then("Open App and check correct open App")
    public void checkCorrectOpenApp() {
        openApp().checkLoadApp();
    }

}
