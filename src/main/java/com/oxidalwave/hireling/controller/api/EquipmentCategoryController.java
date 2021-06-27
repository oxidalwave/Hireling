package com.oxidalwave.hireling.controller.api;

import com.oxidalwave.hireling.model.EquipmentCategory;
import com.oxidalwave.hireling.repository.EquipmentCategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/equipment-categories")
public class EquipmentCategoryController {
    @Autowired
    private EquipmentCategoryDao repository;

    @GetMapping("/")
    public List<EquipmentCategory> getEquipmentCategorys() {
        return repository.findAll();
    }

    @GetMapping("/{index}")
    public EquipmentCategory getEquipmentCategoryByIndex(@PathVariable String index) {
        return repository.findByIndex(index);
    }
}
