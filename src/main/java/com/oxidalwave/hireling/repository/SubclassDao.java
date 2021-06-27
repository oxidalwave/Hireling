package com.oxidalwave.hireling.repository;

import com.oxidalwave.hireling.model.Subclass;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SubclassDao extends MongoRepository<Subclass, String> {
    Subclass findByIndex(final String index);
}
