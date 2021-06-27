package com.oxidalwave.hireling.repository;

import com.oxidalwave.hireling.model.DamageType;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DamageTypeDao extends MongoRepository<DamageType, String> {
    DamageType findByIndex(final String index);

    DamageType findByRef(final String index, final String name, final String url);
}
