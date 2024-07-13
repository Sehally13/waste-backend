package com.waste.management.controller;

import com.waste.management.entity.Waste;
import com.waste.management.service.WasteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/waste")
public class WasteController {

    @Autowired
    private WasteService wasteService;

    @PostMapping("/add")
    public Waste addWaste(@RequestBody Waste waste) {
        return wasteService.addWaste(waste);
    }

    @GetMapping("/list")
    public List<Waste> getAllWaste() {
        return wasteService.getAllWaste();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteWaste(@PathVariable Long id) {
        wasteService.deleteWaste(id);
    }
}
