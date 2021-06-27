package com.oxidalwave.hireling.repository;

import com.oxidalwave.hireling.model.Subrace;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SubraceDao extends MongoRepository<Subrace, String> {
    Subrace findByIndex(final String index);

    Subrace findByRef(final String index, final String name, final String url);
}
