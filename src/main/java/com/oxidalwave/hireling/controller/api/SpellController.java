package com.oxidalwave.hireling.controller.api;

import com.oxidalwave.hireling.model.Spell;
import com.oxidalwave.hireling.repository.SpellDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/spells")
public class SpellController {
    @Autowired
    private SpellDao repository;

    @GetMapping("/{index}")
    public Spell getSpellById(@PathVariable String index) {
        return repository.findByIndex(index);
    }


}
