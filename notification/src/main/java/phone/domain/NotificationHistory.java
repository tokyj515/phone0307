package phone.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import phone.NotificationApplication;
import phone.domain.NotificationSent;

@Entity
@Table(name = "NotificationHistory_table")
@Data
//<<< DDD / Aggregate Root
public class NotificationHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long notificationId;

    private Long userId;

    private String message;

    private String sentAt;

    private String status;

    @PostPersist
    public void onPostPersist() {
        NotificationSent notificationSent = new NotificationSent(this);
        notificationSent.publishAfterCommit();
    }

    public static NotificationHistoryRepository repository() {
        NotificationHistoryRepository notificationHistoryRepository = NotificationApplication.applicationContext.getBean(
            NotificationHistoryRepository.class
        );
        return notificationHistoryRepository;
    }

    //<<< Clean Arch / Port Method
    public static void notification(
        InsuranceClaimSubmitted insuranceClaimSubmitted
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        NotificationHistory notificationHistory = new NotificationHistory();
        repository().save(notificationHistory);

        */

        /** Example 2:  finding and process
        

        repository().findById(insuranceClaimSubmitted.get???()).ifPresent(notificationHistory->{
            
            notificationHistory // do something
            repository().save(notificationHistory);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void notification(
        InsuranceClaimCanceled insuranceClaimCanceled
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        NotificationHistory notificationHistory = new NotificationHistory();
        repository().save(notificationHistory);

        */

        /** Example 2:  finding and process
        

        repository().findById(insuranceClaimCanceled.get???()).ifPresent(notificationHistory->{
            
            notificationHistory // do something
            repository().save(notificationHistory);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
