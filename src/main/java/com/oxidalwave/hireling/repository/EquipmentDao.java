package com.oxidalwave.hireling.repository;

import com.oxidalwave.hireling.model.Equipment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EquipmentDao extends MongoRepository<Equipment, String> {
    Equipment findByIndex(final String index);

    Equipment findByRef(final String index, final String name, final String url);
}
