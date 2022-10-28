package starter.Project;

import static net.serenitybdd.rest.SerenityRest.given;

public class GetCart {

    private String url;
    public void setUrlGetAllCart() {
        url = "https://fakestoreapi.com/carts";
    }

    public void requestWithValidUrl() {
        given().when().get(url);
    }
}
