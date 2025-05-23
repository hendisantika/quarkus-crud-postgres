package id.my.hendisantika.controller;

import id.my.hendisantika.entity.Person;
import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testcontainers.junit.jupiter.Testcontainers;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

/**
 * Created by IntelliJ IDEA.
 * Project : quarkus-crud-postgres
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 21/02/25
 * Time: 07.53
 * To change this template use File | Settings | File Templates.
 */
@QuarkusTest
@Testcontainers
@QuarkusTestResource(PostgresResource.class)
public class PersonResourceTest {
    @BeforeEach
    public void setUp() {
        RestAssured.baseURI = "http://localhost:8081";
    }

    @Test
    public void testCreatePerson() {
        Person person = new Person();
        person.name = "John Doe";
        person.age = 30;

        given()
                .contentType(ContentType.JSON)
                .body(person)
                .when()
                .post("/persons")
                .then()
                .statusCode(201)
                .body("name", is("John Doe"))
                .body("age", is(30));
    }

    @Test
    public void testGetPerson() {
        given()
                .when()
                .get("/persons/1")
                .then()
                .statusCode(200)
                .body("name", is("John Doe"))
                .body("age", is(30));
    }

}
