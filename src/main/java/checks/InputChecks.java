package checks;

import io.restassured.response.Response;
import util.VowelChecker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class InputChecks {

    VowelChecker vowelChecker = new VowelChecker();

    /*this method and class in general is encapsulating the asserts from the test class in order for us to have a
    cleaner code and the test class to be more readable*/
    public void inputResponseChecks(Response response, String word){
        String responseString = response.body().asString();

        assertEquals(word, responseString);
        assertFalse(vowelChecker.hasVowels(responseString));
    }
}
