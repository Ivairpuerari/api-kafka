package br.com.kafka.consumerproducer.app.producer.dataprovider;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import br.com.kafka.consumerproducer.domain.producer.dataprovider.EventHandleDataProvider;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class EventHandlerProvider implements EventHandleDataProvider {

    private KafkaTemplate<Object, Object> template;

    @Override
    public boolean sendEvent(String message) {
        try {
            this.template.send("coletas", message);
        } catch (Exception e) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

}
