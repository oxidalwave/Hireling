package com.oxidalwave.hireling.repository;

import com.oxidalwave.hireling.model.RuleSection;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RuleSectionDao extends MongoRepository<RuleSection, String> {
    RuleSection findByIndex(final String index);

    RuleSection findByRef(final String index, final String name, final String url);
}
