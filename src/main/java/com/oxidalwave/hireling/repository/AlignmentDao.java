package com.oxidalwave.hireling.repository;

import com.oxidalwave.hireling.model.Alignment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlignmentDao extends MongoRepository<Alignment, String> {
    Alignment findByIndex(final String index);
}
