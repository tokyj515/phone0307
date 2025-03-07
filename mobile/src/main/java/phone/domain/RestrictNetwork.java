package phone.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import phone.MobileApplication;
import phone.domain.NetworkRestrictionCompleted;
import phone.domain.NetworkUnrestrictionCompleted;

@Entity
@Table(name = "RestrictNetwork_table")
@Data
//<<< DDD / Aggregate Root
public class RestrictNetwork {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long restrictionId;

    private Long userId;

    private String phone;

    private String imei;

    private String status;

    private String restrictedAt;

    @PostPersist
    public void onPostPersist() {
        NetworkRestrictionCompleted networkRestrictionCompleted = new NetworkRestrictionCompleted(
            this
        );
        networkRestrictionCompleted.publishAfterCommit();

        NetworkUnrestrictionCompleted networkUnrestrictionCompleted = new NetworkUnrestrictionCompleted(
            this
        );
        networkUnrestrictionCompleted.publishAfterCommit();
    }

    public static RestrictNetworkRepository repository() {
        RestrictNetworkRepository restrictNetworkRepository = MobileApplication.applicationContext.getBean(
            RestrictNetworkRepository.class
        );
        return restrictNetworkRepository;
    }

    //<<< Clean Arch / Port Method
    public static void restrictNetwork(
        LostReportCompleted lostReportCompleted
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        RestrictNetwork restrictNetwork = new RestrictNetwork();
        repository().save(restrictNetwork);

        */

        /** Example 2:  finding and process
        

        repository().findById(lostReportCompleted.get???()).ifPresent(restrictNetwork->{
            
            restrictNetwork // do something
            repository().save(restrictNetwork);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void unrestrictNetwork(
        LostReportCancelCompleted lostReportCancelCompleted
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        RestrictNetwork restrictNetwork = new RestrictNetwork();
        repository().save(restrictNetwork);

        */

        /** Example 2:  finding and process
        

        repository().findById(lostReportCancelCompleted.get???()).ifPresent(restrictNetwork->{
            
            restrictNetwork // do something
            repository().save(restrictNetwork);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
