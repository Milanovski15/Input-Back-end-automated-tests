package inputTests;

import checks.InputChecks;
import client.InputClient;
import io.restassured.response.Response;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InputGetEndpointTests {

    InputChecks inputChecks = new InputChecks();

    @Test
    public void vowelsRemovalTest(){
        Response inputResponse = new InputClient()
                .getInput();

        assertEquals(200, inputResponse.statusCode());
        inputChecks.inputResponseChecks(inputResponse, ":npt");
    }
}

/*Service notes:
-slow response time (average 3.6 seconds)
-response body should be stored in an object (if the response body was stored in an object, models would be used with getters for the values inside of it)
-service is not constantly working properly, fails on every 4 to 5 requests average with status code 500
-the error message is not descriptive enough and is also not stored in an object*/
