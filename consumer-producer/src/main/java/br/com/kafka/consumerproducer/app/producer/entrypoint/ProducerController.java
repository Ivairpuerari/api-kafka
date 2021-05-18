package br.com.kafka.consumerproducer.app.producer.entrypoint;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kafka.consumerproducer.commons.ResponseData;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/producer")
@AllArgsConstructor
public class ProducerController implements ProducerResource {

    @Override
    public ResponseEntity<ResponseData> send(String message) {

        var response = ResponseData.builder().code(200).status(Boolean.TRUE).message(message).build();

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @KafkaListener(topics = { "coletas" })
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }

}
