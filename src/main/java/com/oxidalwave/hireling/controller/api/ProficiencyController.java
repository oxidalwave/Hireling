package com.oxidalwave.hireling.controller.api;

import com.oxidalwave.hireling.model.Proficiency;
import com.oxidalwave.hireling.repository.ProficiencyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/proficiencies")
public class ProficiencyController {
    @Autowired
    private ProficiencyDao repository;

    @GetMapping("/")
    public List<Proficiency> getProficiencys() {
        return repository.findAll();
    }

    @GetMapping("/{index}")
    public Proficiency getProficiencyByIndex(@PathVariable String index) {
        return repository.findByIndex(index);
    }
}
