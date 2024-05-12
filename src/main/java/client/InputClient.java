package client;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import util.Configuration;

public class InputClient {

    /*client class is the class where the request parameters are set like URL, type of request, header params (if any) etc. are set.
     In our case, we only need to set the type of the request which is GET and send the url which is configured
      as a static variable in the Configuration class*/
    public Response getInput(){
        return RestAssured
                .given()
                .when().log().all()
                .get(Configuration.INPUT_GET)
                .thenReturn();
    }

}
