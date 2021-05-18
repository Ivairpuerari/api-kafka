package br.com.kafka.consumerproducer.domain.producer.usecase;

public interface SendUseCase {
    boolean execute(String message);
}
