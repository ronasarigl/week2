package starter.Stepdefiniton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Project.GetCart;

public class GetCartStep {

    @Steps
    GetCart getCart;
    @Given("I set url get all cart")
    public void iSetUrlGetAllCart() {
        getCart.setUrlGetAllCart();
    }

    @When("I request with valid url get all")
    public void iRequestWithValidUrlGetAll() {
        getCart.requestWithValidUrl();
    }
}
