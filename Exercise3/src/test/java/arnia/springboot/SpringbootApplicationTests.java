package arnia.springboot;

import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {
    @Test
    public void addUser() {

        RestAssured.baseURI = "http://localhost:5050";
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");

        JsonObject requestParams = new JsonObject();
        requestParams.addProperty("firstName", "Mannaggia");
        requestParams.addProperty("lastName", "Miseria");
        request.body(requestParams.toString());

        Response response = request.post("/people");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(201, statusCode);
    }

}
