package com.oxidalwave.hireling.controller.api;

import com.oxidalwave.hireling.model.Language;
import com.oxidalwave.hireling.repository.LanguageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {
    @Autowired
    private LanguageDao repository;

    @GetMapping("/")
    public List<Language> getLanguages() {
        return repository.findAll();
    }

    @GetMapping("/{index}")
    public Language getLanguageByIndex(@PathVariable String index) {
        return repository.findByIndex(index);
    }
}
