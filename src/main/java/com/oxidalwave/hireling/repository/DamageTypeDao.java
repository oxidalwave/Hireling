package com.oxidalwave.hireling.repository;

import com.oxidalwave.hireling.model.DamageType;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DamageTypeDao extends MongoRepository<DamageType, String> {
    DamageType findByIndex(final String index);
}
