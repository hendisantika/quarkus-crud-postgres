package id.my.hendisantika.controller;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.BeforeEach;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

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
public class ItemResourceIT {

    @Container
    public static PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:17.3-alpine3.20")
            .withDatabaseName("person")
            .withUsername("yu71")
            .withPassword("53cret");

    @BeforeEach
    public void setup() {
        System.setProperty("quarkus.datasource.jdbc.url", postgres.getJdbcUrl());
        System.setProperty("quarkus.datasource.username", postgres.getUsername());
        System.setProperty("quarkus.datasource.password", postgres.getPassword());
    }
}
