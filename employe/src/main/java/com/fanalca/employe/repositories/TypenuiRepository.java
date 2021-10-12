package com.fanalca.employe.repositories;

import com.fanalca.employe.models.TypenuiModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypenuiRepository extends CrudRepository<TypenuiModel, Long> {
    
}
