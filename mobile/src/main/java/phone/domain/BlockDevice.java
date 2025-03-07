package phone.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import phone.MobileApplication;
import phone.domain.DeviceBlockCompleted;
import phone.domain.DeviceUnblockCompleted;

@Entity
@Table(name = "BlockDevice_table")
@Data
//<<< DDD / Aggregate Root
public class BlockDevice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long blockId;

    private Long userId;

    private String phone;

    private String imei;

    private String blockStatus;

    private Date blockAt;

    @PostPersist
    public void onPostPersist() {
        DeviceBlockCompleted deviceBlockCompleted = new DeviceBlockCompleted(
            this
        );
        deviceBlockCompleted.publishAfterCommit();

        DeviceUnblockCompleted deviceUnblockCompleted = new DeviceUnblockCompleted(
            this
        );
        deviceUnblockCompleted.publishAfterCommit();
    }

    public static BlockDeviceRepository repository() {
        BlockDeviceRepository blockDeviceRepository = MobileApplication.applicationContext.getBean(
            BlockDeviceRepository.class
        );
        return blockDeviceRepository;
    }

    //<<< Clean Arch / Port Method
    public static void blockDevice(LostReportCompleted lostReportCompleted) {
        //implement business logic here:

        /** Example 1:  new item 
        BlockDevice blockDevice = new BlockDevice();
        repository().save(blockDevice);

        */

        /** Example 2:  finding and process
        

        repository().findById(lostReportCompleted.get???()).ifPresent(blockDevice->{
            
            blockDevice // do something
            repository().save(blockDevice);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void unblockDevice(
        LostReportCancelCompleted lostReportCancelCompleted
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        BlockDevice blockDevice = new BlockDevice();
        repository().save(blockDevice);

        */

        /** Example 2:  finding and process
        

        repository().findById(lostReportCancelCompleted.get???()).ifPresent(blockDevice->{
            
            blockDevice // do something
            repository().save(blockDevice);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
