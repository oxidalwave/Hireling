package com.oxidalwave.hireling.repository;

import com.oxidalwave.hireling.model.Level;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LevelDao extends MongoRepository<Level, String> {
    Level findByIndex(final String index);
}
