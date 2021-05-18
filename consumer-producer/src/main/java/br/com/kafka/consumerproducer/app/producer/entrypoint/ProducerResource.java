package br.com.kafka.consumerproducer.app.producer.entrypoint;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.kafka.consumerproducer.commons.ResponseData;

public interface ProducerResource {
    @PostMapping(value = "/send", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseData> send(@RequestBody String message);
}
