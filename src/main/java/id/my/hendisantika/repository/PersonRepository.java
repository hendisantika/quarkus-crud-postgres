package id.my.hendisantika.repository;

import id.my.hendisantika.entity.Person;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

/**
 * Created by IntelliJ IDEA.
 * Project : quarkus-crud-postgres
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 21/02/25
 * Time: 07.50
 * To change this template use File | Settings | File Templates.
 */
@ApplicationScoped
public class PersonRepository implements PanacheRepository<Person> {
}
