package com.oxidalwave.hireling.controller.api;

import com.oxidalwave.hireling.model.AbilityScore;
import com.oxidalwave.hireling.repository.AbilityScoreDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ability-scores")
public class AbilityScoreController {
    @Autowired
    private AbilityScoreDao repository;

    @GetMapping("/")
    public List<AbilityScore> getAbilityScores() {
        return repository.findAll();
    }

    @GetMapping("/{index}")
    public AbilityScore getAbilityScoreByIndex(@PathVariable String index) {
        return repository.findByIndex(index);
    }
}
