package com.augustomteixeira.validacaocustumizada.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.augustomteixeira.validacaocustumizada.model.PassaTempo;

@Repository
public interface PassaTempoRepository extends JpaRepository<PassaTempo, Integer>{

}
