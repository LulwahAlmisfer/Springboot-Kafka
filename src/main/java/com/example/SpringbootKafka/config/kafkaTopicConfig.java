package com.example.SpringbootKafka.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaTopicConfig {
    @Bean
  public NewTopic firstTopic(){
      return TopicBuilder.name("firstTopic").build();
  }
}
