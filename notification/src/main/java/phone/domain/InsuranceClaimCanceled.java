package phone.domain;

import java.util.*;
import lombok.*;
import phone.domain.*;
import phone.infra.AbstractEvent;

@Data
@ToString
public class InsuranceClaimCanceled extends AbstractEvent {

    private Long insuranceId;
    private Long userId;
    private String phone;
    private Date canceledAt;
    private String reason;
}
