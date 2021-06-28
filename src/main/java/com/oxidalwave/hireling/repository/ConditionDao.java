package com.oxidalwave.hireling.repository;

import com.oxidalwave.hireling.model.Condition;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConditionDao extends MongoRepository<Condition, String> {
    Condition findByIndex(final String index);
}
