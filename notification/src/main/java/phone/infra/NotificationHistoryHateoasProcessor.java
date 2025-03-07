package phone.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import phone.domain.*;

@Component
public class NotificationHistoryHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<NotificationHistory>> {

    @Override
    public EntityModel<NotificationHistory> process(
        EntityModel<NotificationHistory> model
    ) {
        return model;
    }
}
