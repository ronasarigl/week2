package starter.Project;

import static net.serenitybdd.rest.SerenityRest.given;

public class GetProduct {

    private String url, url2;

    public void setUrl() {
        url = "https://fakestoreapi.com/products";
    }

    public void requestGetAllProduct() {
        given().when().get(url);
    }

    public void setUrlGetProduct() {
        url2 = "https://fakestoreapi.com/products/1";
    }

    public void requestGetProduct() {
        given().when().get(url2);
    }
}

