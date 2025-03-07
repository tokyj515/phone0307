package phone.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import phone.domain.*;
import phone.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class LostReportCompleted extends AbstractEvent {

    private Long reportId;
    private Long userId;
    private String phone;
    private Date lostDate;
    private String status;
    private Date reportedAt;

    public LostReportCompleted(LostReport aggregate) {
        super(aggregate);
    }

    public LostReportCompleted() {
        super();
    }
}
//>>> DDD / Domain Event
