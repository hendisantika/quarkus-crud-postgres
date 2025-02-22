package id.my.hendisantika.controller;

import id.my.hendisantika.entity.Item;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

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

    @POST
    @Transactional
    public Response addItem(Item item) {
        item.persist();
        return Response.status(Response.Status.CREATED).entity(item).build();
    }
}
