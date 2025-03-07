package phone.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import phone.domain.*;

@Component
public class BlockDeviceHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<BlockDevice>> {

    @Override
    public EntityModel<BlockDevice> process(EntityModel<BlockDevice> model) {
        return model;
    }
}
