package com.fanalca.employe.services;

import java.util.ArrayList;
import java.util.Optional;

import com.fanalca.employe.models.EmployeModel;
import com.fanalca.employe.repositories.EmployeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeService {
    @Autowired
    EmployeRepository employeRepository;

    public ArrayList<EmployeModel> getAllEmployes() {        
        return (ArrayList<EmployeModel>) employeRepository.findAll();
    }

    public EmployeModel saveEmploye(EmployeModel employe) {
        return employeRepository.save(employe);
    }

    public Optional<EmployeModel> getEmployeById(Long id) {
        return employeRepository.findById(id);
    }

    public ArrayList<EmployeModel> getEmployeByName(String name) {
        return employeRepository.findByNombres(name);
    }

    public boolean deleteEmploye(Long id) {
        try {
            employeRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
