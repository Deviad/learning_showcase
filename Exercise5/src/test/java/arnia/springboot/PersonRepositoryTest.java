package arnia.springboot;

import arnia.springboot.persistence.domain.Person;
import arnia.springboot.persistence.repositories.PersonRepository;
import com.google.gson.JsonObject;
import com.mongodb.MongoException;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PersonRepositoryTest {
    @Autowired
    private PersonRepository personRepository;
    @Test
    public void addUser() {

        RestAssured.baseURI = "http://localhost:5050";
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");

        JsonObject requestParams = new JsonObject();
        requestParams.addProperty("firstName", "Ciccio2");
        requestParams.addProperty("lastName", "Pizzo2");
        request.body(requestParams.toString());

        Response response = request.post("/people");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(201, statusCode);
    }

    @Test
    public void givenPersonRepository_whenSaveAndRetreiveEntity_thenOK() {
        Person customer = personRepository
                .save(new Person("Jack", "Bauer"));
        Person foundEntity = personRepository
                .findByLastName(customer.getLastName()).stream().findFirst().orElseThrow(() ->  new MongoException("Entity not found"));
        assertNotNull(foundEntity);
        assertEquals(customer.getLastName(), foundEntity.getLastName());
    }

}