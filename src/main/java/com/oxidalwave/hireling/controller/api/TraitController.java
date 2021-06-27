package com.oxidalwave.hireling.controller.api;

import com.oxidalwave.hireling.model.Trait;
import com.oxidalwave.hireling.repository.TraitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/traits")
public class TraitController {
    @Autowired
    private TraitDao repository;

    @GetMapping("/")
    public List<Trait> getTraits() {
        return repository.findAll();
    }

    @GetMapping("/{index}")
    public Trait getTraitByIndex(@PathVariable String index) {
        return repository.findByIndex(index);
    }
}
