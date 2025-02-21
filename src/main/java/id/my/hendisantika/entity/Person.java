package id.my.hendisantika.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

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
@Entity
public class Person extends PanacheEntity {
    public String name;
    public int age;
}
