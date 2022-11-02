package sample;

import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import io.smallrye.mutiny.infrastructure.Infrastructure;
import org.jboss.logging.Logger;
import org.jboss.resteasy.reactive.common.NotImplementedYet;

import javax.enterprise.context.ApplicationScoped;
import java.util.Map;

@ApplicationScoped

public class PartyService {

    //TODO: centralize log handling
    private static final Logger LOG = Logger.getLogger(PartyService.class);

    public Uni<String> createPartyAsync(String name, String org, Multi<User> users, Multi<String> partyItems){
        LOG.error("createParty not implemented, yet");

        // do all the fancy things from the sequence diagram

        return Uni.createFrom().item(new Party("dummyId").id)
                .emitOn(Infrastructure.getDefaultExecutor());

    }
}
