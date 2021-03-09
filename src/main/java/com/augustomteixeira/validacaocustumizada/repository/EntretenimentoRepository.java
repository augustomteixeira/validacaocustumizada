package com.augustomteixeira.validacaocustumizada.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.augustomteixeira.validacaocustumizada.model.Entretenimento;

@Repository
public interface EntretenimentoRepository extends JpaRepository<Entretenimento, Integer>{

}
