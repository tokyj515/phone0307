package phone.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import phone.domain.*;

@Component
public class RestrictNetworkHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<RestrictNetwork>> {

    @Override
    public EntityModel<RestrictNetwork> process(
        EntityModel<RestrictNetwork> model
    ) {
        return model;
    }
}
