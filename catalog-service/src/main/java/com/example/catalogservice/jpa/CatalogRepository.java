package com.example.catalogservice.jpa;

import org.springframework.data.repository.CrudRepository;

public interface CatalogRepository extends CrudRepository<CatalogEntity, Long> {
    CatalogEntity findByProductId(String productId);

    /**
     * AWS Lambda, Azure Functions - 이관 시킬 코드
     */
    CatalogEntity findByProductName(String productName);
}