package starter.Stepdefiniton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Project.GetProduct;

public class GetProductStep {

    @Steps
    GetProduct getProduct;
    @Given("I set the url")
    public void iSetTheUrl() {
        getProduct.setUrl();
    }

    @When("I send request get all product")
    public void iSendRequestGetAllProduct() {
        getProduct.requestGetAllProduct();
    }

    @Given("I set url get a product")
    public void iSetUrlGetAProduct() {
        getProduct.setUrlGetProduct();
    }

    @When("I request get product")
    public void iRequestGetProduct() {
        getProduct.requestGetProduct();
    }
}
