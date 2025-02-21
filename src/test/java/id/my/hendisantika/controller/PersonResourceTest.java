package id.my.hendisantika.controller;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import org.testcontainers.containers.PostgreSQLContainer;

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
    @Container
    public static PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:17.3-alpine3.20")
            .withDatabaseName("person")
            .withUsername("yu71")
            .withPassword("53cret");

}
