package com.oxidalwave.hireling.repository;

import com.oxidalwave.hireling.model.MagicItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MagicItemDao extends MongoRepository<MagicItem, String> {
    MagicItem findByIndex(final String index);
}
