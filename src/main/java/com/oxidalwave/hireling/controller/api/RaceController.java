package com.oxidalwave.hireling.controller.api;

import com.oxidalwave.hireling.model.Race;
import com.oxidalwave.hireling.repository.RaceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/races")
public class RaceController {
    @Autowired
    private RaceDao repository;

    @GetMapping("/")
    public List<Race> getRaces() {
        return repository.findAll();
    }

    @GetMapping("/{index}")
    public Race getRaceByIndex(@PathVariable String index) {
        return repository.findByIndex(index);
    }
}
