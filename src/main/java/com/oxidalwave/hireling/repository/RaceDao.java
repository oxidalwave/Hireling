package com.oxidalwave.hireling.repository;

import com.oxidalwave.hireling.model.Race;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RaceDao extends MongoRepository<Race, String> {
    Race findByIndex(final String index);
}
