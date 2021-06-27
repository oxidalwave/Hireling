package com.oxidalwave.hireling.controller.api;

import com.oxidalwave.hireling.model.Rule;
import com.oxidalwave.hireling.repository.RuleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/rules")
public class RuleController {
    @Autowired
    private RuleDao repository;

    @GetMapping("/")
    public List<Rule> getRules() {
        return repository.findAll();
    }

    @GetMapping("/{index}")
    public Rule getRuleByIndex(@PathVariable String index) {
        return repository.findByIndex(index);
    }
}
