package com.oxidalwave.hireling.controller.api;

import com.oxidalwave.hireling.model.Skill;
import com.oxidalwave.hireling.repository.SkillDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/skills")
public class SkillController {
    @Autowired
    private SkillDao repository;

    @GetMapping("/")
    public List<Skill> getSkills() {
        return repository.findAll();
    }

    @GetMapping("/{index}")
    public Skill getSkillByIndex(@PathVariable String index) {
        return repository.findByIndex(index);
    }
}
