package com.oxidalwave.hireling.controller.api;

import com.oxidalwave.hireling.model.WeaponProperty;
import com.oxidalwave.hireling.repository.WeaponPropertyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/weapon-properties")
public class WeaponPropertyController {
    @Autowired
    private WeaponPropertyDao repository;

    @GetMapping("/")
    public List<WeaponProperty> getWeaponProperties() {
        return repository.findAll();
    }

    @GetMapping("/{index}")
    public WeaponProperty getWeaponPropertyByIndex(@PathVariable String index) {
        return repository.findByIndex(index);
    }
}
