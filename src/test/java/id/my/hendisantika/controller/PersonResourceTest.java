package id.my.hendisantika.controller;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;

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

}
