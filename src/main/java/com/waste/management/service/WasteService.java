package com.waste.management.service;

import com.waste.management.entity.Waste;
import com.waste.management.repository.WasteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WasteService {

    @Autowired
    private WasteRepository wasteRepository;

    public Waste addWaste(Waste waste) {
        return wasteRepository.save(waste);
    }

    public List<Waste> getAllWaste() {
        return wasteRepository.findAll();
    }

    public void deleteWaste(Long id) {
        wasteRepository.deleteById(id);
    }
}
