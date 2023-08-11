package com.example.catalogservice.messagequeue;

//@Service
//@Slf4j
//@RequiredArgsConstructor
//public class KafkaConsumer {
//
//    private final CatalogRepository catalogRepository;
//
//    @KafkaListener(topics = "example-catalog-topic")
//    public void updateQty(String kafkaMessage) {
//        log.info("Kafka Message -> {}", kafkaMessage);
//
//        Map<Object, Object> map = new HashMap<>();
//        ObjectMapper mapper = new ObjectMapper();
//
//        try {
//            map = mapper.readValue(kafkaMessage, new TypeReference<>() {});
//        } catch (JsonProcessingException ex) {
//            ex.printStackTrace();
//        }
//
//        CatalogEntity catalogEntity = catalogRepository.findByProductId((String) map.get("productId"));
//        if (catalogEntity != null) {
//            catalogEntity.setStock(catalogEntity.getStock() - (Integer) map.get("qty"));
//            catalogRepository.save(catalogEntity);
//        }
//    }
//}