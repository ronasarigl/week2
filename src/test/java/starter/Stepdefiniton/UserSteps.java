package starter.Stepdefiniton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Project.DeleteUser;

public class UserSteps {

    @Steps
    DeleteUser deleteUser;

    @Given("I set url delete user")
    public void iSetUrlDeleteUser() {
        deleteUser.setUrlDelete();
    }

    @When("I send request delete user")
    public void iSendRequestDeleteUser() {
        deleteUser.requestSendDeleteUser();
    }
}
