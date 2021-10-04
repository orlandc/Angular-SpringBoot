package com.fanalca.employe.repositories;

import java.util.ArrayList;

import com.fanalca.employe.models.EmployeModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepository extends CrudRepository<EmployeModel, Long> {
    public abstract ArrayList<EmployeModel> findByNombres(String nombres);
}
