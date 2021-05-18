package br.com.kafka.consumerproducer.domain.producer.service;

import org.springframework.stereotype.Service;

import br.com.kafka.consumerproducer.domain.producer.dataprovider.EventHandleDataProvider;
import br.com.kafka.consumerproducer.domain.producer.usecase.SendUseCase;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SendService implements SendUseCase {

    private EventHandleDataProvider eventHandleDataProvider;

    @Override
    public boolean execute(String message) {
        return eventHandleDataProvider.sendEvent(message);
    }

}
