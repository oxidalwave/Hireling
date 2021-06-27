package com.oxidalwave.hireling.repository;

import com.oxidalwave.hireling.model.Feature;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FeatureDao extends MongoRepository<Feature, String> {
    Feature findByIndex(final String index);

    Feature findByRef(final String index, final String name, final String url);
}
