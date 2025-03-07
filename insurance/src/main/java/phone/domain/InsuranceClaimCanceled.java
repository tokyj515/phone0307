package phone.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import phone.domain.*;
import phone.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class InsuranceClaimCanceled extends AbstractEvent {

    private Long insuranceId;
    private Long userId;
    private String phone;
    private Date canceledAt;
    private String reason;

    public InsuranceClaimCanceled(Insurance aggregate) {
        super(aggregate);
    }

    public InsuranceClaimCanceled() {
        super();
    }
}
//>>> DDD / Domain Event
