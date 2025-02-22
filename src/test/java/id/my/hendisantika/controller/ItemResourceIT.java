package id.my.hendisantika.controller;

import id.my.hendisantika.entity.Item;
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
 * Date: 22/02/25
 * Time: 08.33
 * To change this template use File | Settings | File Templates.
 */
@QuarkusTest
@Testcontainers
@QuarkusTestResource(PostgresResource.class)
public class ItemResourceIT {

    @BeforeEach
    public void setUp() {
        RestAssured.baseURI = "http://localhost:8081";
    }

    @Test
    public void testCreateAndGetItem() {
        // Create an item
        given()
                .contentType(ContentType.JSON)
                .body(new Item() {{
                    name = "Laptop";
                    description = "A powerful laptop";
                }})
                .when()
                .post("/items")
                .then()
                .statusCode(201);

        // Get all items
        given()
                .when()
                .get("/items")
                .then()
                .statusCode(200)
                .body("$.size()", is(1),
                        "[0].name", is("Laptop"),
                        "[0].description", is("A powerful laptop"));
    }
}
