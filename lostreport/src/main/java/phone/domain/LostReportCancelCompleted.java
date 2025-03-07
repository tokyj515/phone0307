package phone.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import phone.domain.*;
import phone.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class LostReportCancelCompleted extends AbstractEvent {

    private Long reportId;
    private Long userId;
    private String phone;
    private Date canceledAt;
    private String reason;

    public LostReportCancelCompleted(LostReport aggregate) {
        super(aggregate);
    }

    public LostReportCancelCompleted() {
        super();
    }
}
//>>> DDD / Domain Event
