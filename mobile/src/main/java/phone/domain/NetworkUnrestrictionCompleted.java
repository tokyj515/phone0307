package phone.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import phone.domain.*;
import phone.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class NetworkUnrestrictionCompleted extends AbstractEvent {

    private Long restrictionId;
    private Long userId;
    private String phone;
    private String imei;
    private String unrestrictedAt;

    public NetworkUnrestrictionCompleted(RestrictNetwork aggregate) {
        super(aggregate);
    }

    public NetworkUnrestrictionCompleted() {
        super();
    }
}
//>>> DDD / Domain Event
