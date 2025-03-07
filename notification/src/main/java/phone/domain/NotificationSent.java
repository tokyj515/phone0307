package phone.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import phone.domain.*;
import phone.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class NotificationSent extends AbstractEvent {

    private Long notificationId;
    private Long userId;
    private String message;
    private Date sentAt;
    private String status;

    public NotificationSent(NotificationHistory aggregate) {
        super(aggregate);
    }

    public NotificationSent() {
        super();
    }
}
//>>> DDD / Domain Event
