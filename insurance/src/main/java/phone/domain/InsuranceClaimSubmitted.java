package phone.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import phone.domain.*;
import phone.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class InsuranceClaimSubmitted extends AbstractEvent {

    private Long insuranceId;
    private Long userId;
    private String phone;
    private String policyType;
    private String claimStatus;
    private String submittedAt;

    public InsuranceClaimSubmitted(Insurance aggregate) {
        super(aggregate);
    }

    public InsuranceClaimSubmitted() {
        super();
    }
}
//>>> DDD / Domain Event
