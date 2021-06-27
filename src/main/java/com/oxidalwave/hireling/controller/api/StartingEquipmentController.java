package com.oxidalwave.hireling.controller.api;

import com.oxidalwave.hireling.model.StartingEquipment;
import com.oxidalwave.hireling.repository.StartingEquipmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/starting-equipment")
public class StartingEquipmentController {
    @Autowired
    private StartingEquipmentDao repository;

    @GetMapping("/")
    public List<StartingEquipment> getStartingEquipments() {
        return repository.findAll();
    }

    @GetMapping("/{index}")
    public StartingEquipment getStartingEquipmentByIndex(@PathVariable String index) {
        return repository.findByIndex(index);
    }
}
