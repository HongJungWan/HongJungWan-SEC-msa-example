package com.example.catalogservice.messagequeue;

//@EnableKafka
//@Configuration
//public class KafkaConsumerConfig {
//
//    @Bean
//    public ConsumerFactory<String, String> consumerFactory() {
//        Map<String, Object> properties = new HashMap<>();
//        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
//        properties.put(ConsumerConfig.GROUP_ID_CONFIG, "consumerGroupId");
//        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//
//        return new DefaultKafkaConsumerFactory<>(properties);
//    }
//
//    @Bean
//    public ConcurrentKafkaListenerContainerFactory<String, String> kafkaListenerContainerFactory() {
//        ConcurrentKafkaListenerContainerFactory<String, String> kafkaListenerContainerFactory
//                = new ConcurrentKafkaListenerContainerFactory<>();
//        kafkaListenerContainerFactory.setConsumerFactory(consumerFactory());
//
//        return kafkaListenerContainerFactory;
//    }
//}