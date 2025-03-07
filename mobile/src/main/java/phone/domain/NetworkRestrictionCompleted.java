package phone.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import phone.domain.*;
import phone.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class NetworkRestrictionCompleted extends AbstractEvent {

    private Long restrictionId;
    private Long userId;
    private String phone;
    private String imei;
    private String status;
    private Date restrictedAt;

    public NetworkRestrictionCompleted(RestrictNetwork aggregate) {
        super(aggregate);
    }

    public NetworkRestrictionCompleted() {
        super();
    }
}
//>>> DDD / Domain Event
