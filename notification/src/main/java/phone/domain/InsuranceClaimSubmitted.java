package phone.domain;

import java.util.*;
import lombok.*;
import phone.domain.*;
import phone.infra.AbstractEvent;

@Data
@ToString
public class InsuranceClaimSubmitted extends AbstractEvent {

    private Long insuranceId;
    private Long userId;
    private String phone;
    private String policyType;
    private String claimStatus;
    private String submittedAt;
}
