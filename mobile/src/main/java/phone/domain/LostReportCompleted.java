package phone.domain;

import java.util.*;
import lombok.*;
import phone.domain.*;
import phone.infra.AbstractEvent;

@Data
@ToString
public class LostReportCompleted extends AbstractEvent {

    private Long reportId;
    private Long userId;
    private String phone;
    private Date lostDate;
    private String status;
    private Date reportedAt;
}
