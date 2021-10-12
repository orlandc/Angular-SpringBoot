package com.fanalca.employe.services;
    
import java.util.ArrayList;

import com.fanalca.employe.models.AreaModel;
import com.fanalca.employe.models.SubareaModel;
import com.fanalca.employe.repositories.SubareaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubareaService {
    @Autowired
    SubareaRepository subareaRepository;

    public ArrayList<SubareaModel> getAllSubareas() {
        return (ArrayList<SubareaModel>) subareaRepository.findAll();
    }

    public ArrayList<SubareaModel> getAllSubareasbyArea(Long id) {
        AreaModel areaModel = new AreaModel();
        areaModel.setId(id);
        return (ArrayList<SubareaModel>) subareaRepository.findByAreaModel(areaModel);
    }
}
