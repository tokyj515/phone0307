package phone.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import phone.domain.*;
import phone.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeviceBlockCompleted extends AbstractEvent {

    private Long blockId;
    private Long userId;
    private String phone;
    private String imei;
    private String blockStatus;
    private String blockAt;

    public DeviceBlockCompleted(BlockDevice aggregate) {
        super(aggregate);
    }

    public DeviceBlockCompleted() {
        super();
    }
}
//>>> DDD / Domain Event
