package com.oxidalwave.hireling.controller.api;

import com.oxidalwave.hireling.model.Feature;
import com.oxidalwave.hireling.repository.FeatureDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/features")
public class FeatureController {
    @Autowired
    private FeatureDao repository;

    @GetMapping("/")
    public List<Feature> getFeatures() {
        return repository.findAll();
    }

    @GetMapping("/{index}")
    public Feature getFeatureByIndex(@PathVariable String index) {
        return repository.findByIndex(index);
    }
}
