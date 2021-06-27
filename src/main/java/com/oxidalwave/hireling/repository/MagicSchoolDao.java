package com.oxidalwave.hireling.repository;

import com.oxidalwave.hireling.model.MagicSchool;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MagicSchoolDao extends MongoRepository<MagicSchool, String> {
    MagicSchool findByIndex(final String index);

    MagicSchool findByRef(final String index, final String name, final String url);
}
