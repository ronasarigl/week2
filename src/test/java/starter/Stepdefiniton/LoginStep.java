package starter.Stepdefiniton;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Project.Login;

public class LoginStep {

    @Steps
    Login login;
    @Given("I set url user login")
    public void iSetUrlUserLogin() {
        login.setUrlUserLogin();
    }

    @And("I set valid username and password")
    public void iSetValidUsernameAndPassword() {
        login.setValidUsernameAndPassword();
    }

    @When("I request login")
    public void iRequestLogin() {
        login.requestLogin();
    }

    @Then("I get status code 200")
    public void iGetStatusCode200() {
        login.getStatusCode200();
    }

    @And("I input invalid username and password")
    public void iInputInvalidUsernameAndPassword() {
        login.setInvalidUsernameAndPassword();
    }

    @Then("I get code 401")
    public void iGetCode401() {
        login.getCode401();
    }
}
