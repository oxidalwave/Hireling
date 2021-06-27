package com.oxidalwave.hireling.controller.api;

import com.oxidalwave.hireling.model.MagicSchool;
import com.oxidalwave.hireling.repository.MagicSchoolDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/magic-schools")
public class MagicSchoolController {
    @Autowired
    private MagicSchoolDao repository;

    @GetMapping("/")
    public List<MagicSchool> getMagicSchools() {
        return repository.findAll();
    }

    @GetMapping("/{index}")
    public MagicSchool getMagicSchoolByIndex(@PathVariable String index) {
        return repository.findByIndex(index);
    }
}
