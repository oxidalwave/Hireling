package com.oxidalwave.hireling.repository;

import com.oxidalwave.hireling.model.Background;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BackgroundDao extends MongoRepository<Background, String> {
    Background findByIndex(final String index);
}
