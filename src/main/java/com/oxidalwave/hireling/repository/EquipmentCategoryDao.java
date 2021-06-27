package com.oxidalwave.hireling.repository;

import com.oxidalwave.hireling.model.EquipmentCategory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EquipmentCategoryDao extends MongoRepository<EquipmentCategory, String> {
    EquipmentCategory findByIndex(final String index);

    EquipmentCategory findByRef(final String index, final String name, final String url);
}
