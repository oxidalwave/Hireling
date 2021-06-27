package com.oxidalwave.hireling.repository;

import com.oxidalwave.hireling.model.Trait;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TraitDao extends MongoRepository<Trait, String> {
    Trait findByIndex(final String index);

    Trait findByRef(final String index, final String name, final String url);
}
