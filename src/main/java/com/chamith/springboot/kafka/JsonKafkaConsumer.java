package com.chamith.springboot.kafka;

import com.chamith.springboot.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "topicChamith_json", groupId = "myGroup")
    public void consume(User user){
        LOGGER.info("Receive message from topicChamith_json: {}", user.toString());
    }
}
