package com.oxidalwave.hireling.controller.api;

import com.oxidalwave.hireling.model.MagicItem;
import com.oxidalwave.hireling.repository.MagicItemDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/magic-items")
public class MagicItemController {
    @Autowired
    private MagicItemDao repository;

    @GetMapping("/")
    public List<MagicItem> getMagicItems() {
        return repository.findAll();
    }

    @GetMapping("/{index}")
    public MagicItem getMagicItemByIndex(@PathVariable String index) {
        return repository.findByIndex(index);
    }
}
