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
    BlockDeviceRepository blockDeviceRepository;

    @Autowired
    RestrictNetworkRepository restrictNetworkRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='LostReportCompleted'"
    )
    public void wheneverLostReportCompleted_BlockDevice(
        @Payload LostReportCompleted lostReportCompleted
    ) {
        LostReportCompleted event = lostReportCompleted;
        System.out.println(
            "\n\n##### listener BlockDevice : " + lostReportCompleted + "\n\n"
        );

        // Sample Logic //
        BlockDevice.blockDevice(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='LostReportCancelCompleted'"
    )
    public void wheneverLostReportCancelCompleted_UnblockDevice(
        @Payload LostReportCancelCompleted lostReportCancelCompleted
    ) {
        LostReportCancelCompleted event = lostReportCancelCompleted;
        System.out.println(
            "\n\n##### listener UnblockDevice : " +
            lostReportCancelCompleted +
            "\n\n"
        );

        // Sample Logic //
        BlockDevice.unblockDevice(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='LostReportCompleted'"
    )
    public void wheneverLostReportCompleted_RestrictNetwork(
        @Payload LostReportCompleted lostReportCompleted
    ) {
        LostReportCompleted event = lostReportCompleted;
        System.out.println(
            "\n\n##### listener RestrictNetwork : " +
            lostReportCompleted +
            "\n\n"
        );

        // Sample Logic //
        RestrictNetwork.restrictNetwork(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='LostReportCancelCompleted'"
    )
    public void wheneverLostReportCancelCompleted_UnrestrictNetwork(
        @Payload LostReportCancelCompleted lostReportCancelCompleted
    ) {
        LostReportCancelCompleted event = lostReportCancelCompleted;
        System.out.println(
            "\n\n##### listener UnrestrictNetwork : " +
            lostReportCancelCompleted +
            "\n\n"
        );

        // Sample Logic //
        RestrictNetwork.unrestrictNetwork(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
