package com.oxidalwave.hireling.repository;

import com.oxidalwave.hireling.model.WeaponProperty;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WeaponPropertyDao extends MongoRepository<WeaponProperty, String> {
    WeaponProperty findByIndex(final String index);
}
