package com.oxidalwave.hireling.repository;

import com.oxidalwave.hireling.model.StartingEquipment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StartingEquipmentDao extends MongoRepository<StartingEquipment, String> {
    StartingEquipment findByIndex(final String index);
}
