package com.oxidalwave.hireling.repository;

import com.oxidalwave.hireling.model.Monster;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MonsterDao extends MongoRepository<Monster, String> {
    Monster findByIndex(final String index);

    Monster findByRef(final String index, final String name, final String url);
}
