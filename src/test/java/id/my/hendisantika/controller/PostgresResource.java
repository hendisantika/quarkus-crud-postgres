package id.my.hendisantika.controller;

import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;
import org.testcontainers.containers.PostgreSQLContainer;

import java.util.Collections;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : quarkus-crud-postgres
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 21/02/25
 * Time: 07.54
 * To change this template use File | Settings | File Templates.
 */
public class PostgresResource implements QuarkusTestResourceLifecycleManager {

    static final PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:17.3-alpine3.20")
            .withDatabaseName("person")
            .withUsername("yu71")
            .withPassword("53cret");

    @Override
    public Map<String, String> start() {
        postgres.start();
        return Collections.singletonMap("quarkus.datasource.jdbc.url", postgres.getJdbcUrl());
    }

    @Override
    public void stop() {
        postgres.stop();
    }
}
