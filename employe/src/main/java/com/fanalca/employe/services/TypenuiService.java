package com.fanalca.employe.services;

import java.util.ArrayList;

import com.fanalca.employe.models.TypenuiModel;
import com.fanalca.employe.repositories.TypenuiRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypenuiService {
    @Autowired
    TypenuiRepository typenuiRepository;

    public ArrayList<TypenuiModel> getAllTypenuis() {        
        return (ArrayList<TypenuiModel>) typenuiRepository.findAll();
    }
}
