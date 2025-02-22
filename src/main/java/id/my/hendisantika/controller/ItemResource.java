package id.my.hendisantika.controller;

import id.my.hendisantika.entity.Item;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : quarkus-crud-postgres
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 22/02/25
 * Time: 08.31
 * To change this template use File | Settings | File Templates.
 */
@Path("/items")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ItemResource {
    @GET
    public List<Item> getAllItems() {
        return Item.listAll();
    }

    @GET
    @Path("/{id}")
    public Item getItem(@PathParam("id") Long id) {
        return Item.findById(id);
    }
}
