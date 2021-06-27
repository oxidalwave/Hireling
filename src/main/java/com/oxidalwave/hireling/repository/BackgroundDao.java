package com.oxidalwave.hireling.repository;

import com.oxidalwave.hireling.model.Background;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BackgroundDao extends MongoRepository<Background, String> {
    Background findByIndex(final String index);

    Background findByRef(final String index, final String name);
}
