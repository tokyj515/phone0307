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
    InsuranceRepository insuranceRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='LostReportCompleted'"
    )
    public void wheneverLostReportCompleted_SubmitInsuranceClaim(
        @Payload LostReportCompleted lostReportCompleted
    ) {
        LostReportCompleted event = lostReportCompleted;
        System.out.println(
            "\n\n##### listener SubmitInsuranceClaim : " +
            lostReportCompleted +
            "\n\n"
        );

        // Sample Logic //
        Insurance.submitInsuranceClaim(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='LostReportCancelCompleted'"
    )
    public void wheneverLostReportCancelCompleted_CancleInsurance(
        @Payload LostReportCancelCompleted lostReportCancelCompleted
    ) {
        LostReportCancelCompleted event = lostReportCancelCompleted;
        System.out.println(
            "\n\n##### listener CancleInsurance : " +
            lostReportCancelCompleted +
            "\n\n"
        );

        // Sample Logic //
        Insurance.cancleInsurance(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
