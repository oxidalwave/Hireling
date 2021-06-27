package com.oxidalwave.hireling.repository;

import com.oxidalwave.hireling.model.Language;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LanguageDao extends MongoRepository<Language, String> {
    Language findByIndex(final String index);

    Language findByRef(final String index, final String name, final String url);
}
