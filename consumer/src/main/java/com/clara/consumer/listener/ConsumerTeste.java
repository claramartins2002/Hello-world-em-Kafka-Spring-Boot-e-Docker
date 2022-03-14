package com.clara.consumer.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class ConsumerTeste {
    private final Logger logger = LoggerFactory.getLogger(ConsumerTeste.class);

    @KafkaListener(topics = "topic-teste", groupId = "group_id")
    public void consumir(String mensagem) throws Exception {
        logger.info(String.format("#### -> Consumed message -> %s", mensagem));
    }
}
