package com.oxidalwave.hireling.repository;

import com.oxidalwave.hireling.model.Proficiency;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProficiencyDao extends MongoRepository<Proficiency, String> {
    Proficiency findByIndex(final String index);

    Proficiency findByRef(final String index, final String name, final String url);
}
