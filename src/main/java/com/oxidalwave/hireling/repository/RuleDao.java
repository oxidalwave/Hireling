package com.oxidalwave.hireling.repository;

import com.oxidalwave.hireling.model.Rule;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RuleDao extends MongoRepository<Rule, String> {
    Rule findByIndex(final String index);

    Rule findByRef(final String index, final String name, final String url);
}
