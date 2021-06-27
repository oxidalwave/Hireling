package com.oxidalwave.hireling.controller.api;

import com.oxidalwave.hireling.model.Level;
import com.oxidalwave.hireling.repository.LevelDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/levels")
public class LevelController {
    @Autowired
    private LevelDao repository;

    @GetMapping("/")
    public List<Level> getLevels() {
        return repository.findAll();
    }

    @GetMapping("/{index}")
    public Level getLevelByIndex(@PathVariable String index) {
        return repository.findByIndex(index);
    }
}
