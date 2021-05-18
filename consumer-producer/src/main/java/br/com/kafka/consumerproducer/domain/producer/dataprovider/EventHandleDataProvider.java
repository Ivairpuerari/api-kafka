package br.com.kafka.consumerproducer.domain.producer.dataprovider;

public interface EventHandleDataProvider {
    boolean sendEvent(String message);

}
