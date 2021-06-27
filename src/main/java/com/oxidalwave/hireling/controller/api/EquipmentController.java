package com.oxidalwave.hireling.controller.api;

import com.oxidalwave.hireling.model.Equipment;
import com.oxidalwave.hireling.repository.EquipmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/equipment")
public class EquipmentController {
    @Autowired
    private EquipmentDao repository;

    @GetMapping("/")
    public List<Equipment> getEquipments() {
        return repository.findAll();
    }

    @GetMapping("/{index}")
    public Equipment getEquipmentByIndex(@PathVariable String index) {
        return repository.findByIndex(index);
    }
}
