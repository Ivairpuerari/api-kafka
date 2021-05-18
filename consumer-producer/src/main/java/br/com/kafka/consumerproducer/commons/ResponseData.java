package br.com.kafka.consumerproducer.commons;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ResponseData {
    private boolean status;
    private String message;
    private Integer code;
}
