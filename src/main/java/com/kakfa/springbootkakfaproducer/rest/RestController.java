package com.kakfa.springbootkakfaproducer.rest;

import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("kakfa")
public class RestController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC="KakfaExample2";

    @GetMapping("/publish/{message}")
    public String post(@PathVariable("message") final String message){

        kafkaTemplate.send(TOPIC,message);
        
        return "published successfully";
    }
}
