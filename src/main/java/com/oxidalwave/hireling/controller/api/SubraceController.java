package com.oxidalwave.hireling.controller.api;

import com.oxidalwave.hireling.model.Subrace;
import com.oxidalwave.hireling.repository.SubraceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/subraces")
public class SubraceController {
    @Autowired
    private SubraceDao repository;

    @GetMapping("/")
    public List<Subrace> getSubraces() {
        return repository.findAll();
    }

    @GetMapping("/{index}")
    public Subrace getSubraceByIndex(@PathVariable String index) {
        return repository.findByIndex(index);
    }
}
