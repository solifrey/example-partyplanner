package sample;

import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import io.vertx.mutiny.pgclient.PgPool;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.net.URI;


//TODO: implement authentication & authorization based on bearer token:
//@Authenticated
@Path("/parties")
public class PartyResource {

    //TODO: centralize log handling
    private static final Logger LOG = Logger.getLogger(PartyResource.class);

    @Inject
    PartyService partyService;

    @GET
    @Path("{id}")
    public String getParty(String id){
        return "A party could be here";
    }

    /*
    removing, since it's blocking build
    @POST
    public Uni<String> createParty(String name, String org, Multi<User> users, Multi<String> partyItems){
        //TODO: replace .toString with proper stringification
        LOG.trace(String.format("Entered createParty (name=%s; org=%s; users=%s, partyItems=%s)", name, org, users.toString(), partyItems.toString()));
        return partyService.createPartyAsync(name, org, users, partyItems);
    }

     */
}