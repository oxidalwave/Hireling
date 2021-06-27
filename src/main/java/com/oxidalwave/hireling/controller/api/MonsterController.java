package com.oxidalwave.hireling.controller.api;

import com.oxidalwave.hireling.model.Monster;
import com.oxidalwave.hireling.repository.MonsterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/monsters")
public class MonsterController {
    @Autowired
    private MonsterDao repository;

    @GetMapping("/")
    public List<Monster> getMonsters() {
        return repository.findAll();
    }

    @GetMapping("/{index}")
    public Monster getMonsterByIndex(@PathVariable String index) {
        return repository.findByIndex(index);
    }
}
