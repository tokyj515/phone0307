package phone.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import phone.domain.*;
import phone.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeviceUnblockCompleted extends AbstractEvent {

    private Long blockId;
    private Long userId;
    private String phone;
    private String imei;
    private String unblockedAt;

    public DeviceUnblockCompleted(BlockDevice aggregate) {
        super(aggregate);
    }

    public DeviceUnblockCompleted() {
        super();
    }
}
//>>> DDD / Domain Event
