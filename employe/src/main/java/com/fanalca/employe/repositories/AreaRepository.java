package com.fanalca.employe.repositories;

import com.fanalca.employe.models.AreaModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaRepository extends CrudRepository<AreaModel, Long> {
}
