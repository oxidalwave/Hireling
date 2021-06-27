package com.oxidalwave.hireling.controller.api;

import com.oxidalwave.hireling.model.Alignment;
import com.oxidalwave.hireling.repository.AlignmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/alignments")
public class AlignmentController {
    @Autowired
    private AlignmentDao repository;

    @GetMapping("/")
    public List<Alignment> getAlignments() {
        return repository.findAll();
    }

    @GetMapping("/{index}")
    public Alignment getAlignmentByIndex(@PathVariable String index) {
        return repository.findByIndex(index);
    }
}
