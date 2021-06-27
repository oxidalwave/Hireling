package com.oxidalwave.hireling.controller.api;

import com.oxidalwave.hireling.model.Class;
import com.oxidalwave.hireling.repository.ClassDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/classes")
public class ClassController {
    @Autowired
    private ClassDao repository;

    @GetMapping("/")
    public List<Class> getClasss() {
        return repository.findAll();
    }

    @GetMapping("/{index}")
    public Class getClassByIndex(@PathVariable String index) {
        return repository.findByIndex(index);
    }
}
