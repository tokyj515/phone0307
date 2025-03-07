package phone.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import phone.config.kafka.KafkaProcessor;
import phone.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    NotificationHistoryRepository notificationHistoryRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='InsuranceClaimSubmitted'"
    )
    public void wheneverInsuranceClaimSubmitted_Notification(
        @Payload InsuranceClaimSubmitted insuranceClaimSubmitted
    ) {
        InsuranceClaimSubmitted event = insuranceClaimSubmitted;
        System.out.println(
            "\n\n##### listener Notification : " +
            insuranceClaimSubmitted +
            "\n\n"
        );

        // Sample Logic //
        NotificationHistory.notification(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='InsuranceClaimCanceled'"
    )
    public void wheneverInsuranceClaimCanceled_Notification(
        @Payload InsuranceClaimCanceled insuranceClaimCanceled
    ) {
        InsuranceClaimCanceled event = insuranceClaimCanceled;
        System.out.println(
            "\n\n##### listener Notification : " +
            insuranceClaimCanceled +
            "\n\n"
        );

        // Sample Logic //
        NotificationHistory.notification(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
