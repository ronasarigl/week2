package starter.Project;

import static net.serenitybdd.rest.SerenityRest.given;

public class DeleteUser {

        private String url;
        public void setUrlDelete() {
            url = "https://fakestoreapi.com/users/6";
        }

        public void requestSendDeleteUser() {
            given().when().get(url);
        }
    }

