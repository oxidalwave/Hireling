package com.oxidalwave.hireling.repository;

import com.oxidalwave.hireling.model.Skill;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SkillDao extends MongoRepository<Skill, String> {
    Skill findByIndex(final String index);

    Skill findByRef(final String index, final String name, final String url);
}
