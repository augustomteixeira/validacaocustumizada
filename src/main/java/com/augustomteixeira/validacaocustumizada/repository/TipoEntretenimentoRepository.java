package com.augustomteixeira.validacaocustumizada.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.augustomteixeira.validacaocustumizada.model.list.TipoEntretenimento;

@Repository
public interface TipoEntretenimentoRepository extends JpaRepository<TipoEntretenimento, Integer> {

}
