import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static io.restassured.RestAssured.given;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserTest {
    Integer id = 37;
    @Before
    public void setup() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";

    }
    @Test
    public void a_postRequest()  {

        User user = new User();
        user.setId(id);
        user.setUsername("1s");

        Response response = given()
                .contentType(ContentType.JSON)
                .and()
                .body(user)
                .when()
                .post("/user")
                .then()
                .extract().response();

        Assert.assertEquals(200, response.statusCode());
        response.print();

    }

    @Test
    public void b_putRequest()  {


        User user = new User();
        user.setId(id+1);
        user.setUsername("2s");

        Response response = given()
                .contentType(ContentType.JSON)
                .and()
                .body(user)
                .when().put("/user/"+id)
                .then()
                .extract().response();

        Assert.assertEquals(200, response.statusCode());
        response.print();
    }

    @Test
    public void c_getRequest() {
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("/user/2s")
                .then()
                .extract().response();

        Assert.assertEquals(200, response.statusCode());
        response.print();
    }

    @Test
    public void d_deleteRequest() {
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .delete("/user/2s")
                .then()
                .extract().response();

        Assert.assertEquals(200, response.statusCode());
        response.print();

    }
}
