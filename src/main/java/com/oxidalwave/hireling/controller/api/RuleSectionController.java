package com.oxidalwave.hireling.controller.api;

import com.oxidalwave.hireling.model.RuleSection;
import com.oxidalwave.hireling.repository.RuleSectionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/rule-sections")
public class RuleSectionController {
    @Autowired
    private RuleSectionDao repository;

    @GetMapping("/")
    public List<RuleSection> getRuleSections() {
        return repository.findAll();
    }

    @GetMapping("/{index}")
    public RuleSection getRuleSectionByIndex(@PathVariable String index) {
        return repository.findByIndex(index);
    }
}
