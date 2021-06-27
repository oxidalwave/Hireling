package com.oxidalwave.hireling.controller.api;

import com.oxidalwave.hireling.model.Condition;
import com.oxidalwave.hireling.repository.ConditionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/conditions")
public class ConditionController {
    @Autowired
    private ConditionDao repository;

    @GetMapping("/")
    public List<Condition> getConditions() {
        return repository.findAll();
    }

    @GetMapping("/{index}")
    public Condition getConditionByIndex(@PathVariable String index) {
        return repository.findByIndex(index);
    }
}
