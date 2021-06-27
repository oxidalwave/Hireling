package com.oxidalwave.hireling.repository;

import com.oxidalwave.hireling.model.Class;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClassDao extends MongoRepository<Class, String> {
    Class findByIndex(final String index);

    Class findByRef(final String index, final String name, final String url);
}
