package phone.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import phone.domain.*;

@Component
public class LostReportHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<LostReport>> {

    @Override
    public EntityModel<LostReport> process(EntityModel<LostReport> model) {
        return model;
    }
}
