package sample;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.core.IsNot.not;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class PartyResourceTest {
    @Test
    public void testGetPartyUnauthorized() {
        String token = "";
        given().when().get("/parties").then().statusCode(401);
    }

    // TODO: add mocking to simulate external services
    // TODO: test abstraction here to simulate an authorized user

    @Test
    public void testGetParties(){
        // automatically get all parties the user is authorized to see

    }

    @Test
    public void testCreatePartyWithMembersWithItems(){
        // TODO :)

        // create new party
        // add members on the fly
        // add to-bring-items also
    }

    @Test
    public void testAddMembersToParty(){
        //
    }

    @Test
    public void testAddItemsToParty(){
        //
    }



}