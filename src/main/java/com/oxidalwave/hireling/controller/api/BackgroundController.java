package com.oxidalwave.hireling.controller.api;


import com.oxidalwave.hireling.model.Background;
import com.oxidalwave.hireling.repository.BackgroundDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/background")
public class BackgroundController {
    @Autowired
    private BackgroundDao repository;

    @GetMapping("/")
    public List<Background> getBackgrounds() {
        return repository.findAll();
    }

    @GetMapping("/{index}")
    public Background getBackgroundByIndex(@PathVariable String index) {
        return repository.findByIndex(index);
    }
}
