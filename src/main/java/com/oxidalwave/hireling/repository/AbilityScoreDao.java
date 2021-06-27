package com.oxidalwave.hireling.repository;

import com.oxidalwave.hireling.model.AbilityScore;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AbilityScoreDao extends MongoRepository<AbilityScore, String> {
    AbilityScore findByIndex(final String index);

    AbilityScore findByRef(final String index, final String name, final String url);
}
