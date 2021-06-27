package com.oxidalwave.hireling.controller.api;

import com.oxidalwave.hireling.model.Subclass;
import com.oxidalwave.hireling.repository.SubclassDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/subclasses")
public class SubclassController {
    @Autowired
    private SubclassDao repository;

    @GetMapping("/")
    public List<Subclass> getSubclasss() {
        return repository.findAll();
    }

    @GetMapping("/{index}")
    public Subclass getSubclassByIndex(@PathVariable String index) {
        return repository.findByIndex(index);
    }
}
