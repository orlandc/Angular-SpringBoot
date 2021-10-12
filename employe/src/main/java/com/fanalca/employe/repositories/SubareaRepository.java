package com.fanalca.employe.repositories;

import java.util.List;

import com.fanalca.employe.models.AreaModel;
import com.fanalca.employe.models.SubareaModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubareaRepository extends CrudRepository<SubareaModel, Long> {
    List<SubareaModel> findByAreaModel(AreaModel areaModel);
}
