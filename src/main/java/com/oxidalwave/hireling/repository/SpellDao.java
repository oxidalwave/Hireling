package com.oxidalwave.hireling.repository;

import com.oxidalwave.hireling.model.Spell;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SpellDao extends MongoRepository<Spell, String> {
    Spell findByIndex(final String index);

    Spell findByRef(final String index, final String name, final String url);
}
