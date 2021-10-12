package com.fanalca.employe.services;
    
import java.util.ArrayList;

import com.fanalca.employe.models.AreaModel;
import com.fanalca.employe.repositories.AreaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreaService {
    @Autowired
    AreaRepository areaRepository;

    public ArrayList<AreaModel> getAllAreas() {        
        return (ArrayList<AreaModel>) areaRepository.findAll();
    }
}