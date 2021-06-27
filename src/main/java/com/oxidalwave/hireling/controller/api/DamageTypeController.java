package com.oxidalwave.hireling.controller.api;

import com.oxidalwave.hireling.model.DamageType;
import com.oxidalwave.hireling.repository.DamageTypeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/damage-types")
public class DamageTypeController {
    @Autowired
    private DamageTypeDao repository;

    @GetMapping("/")
    public List<DamageType> getDamageTypes() {
        return repository.findAll();
    }

    @GetMapping("/{index}")
    public DamageType getDamageTypeByIndex(@PathVariable String index) {
        return repository.findByIndex(index);
    }
}
