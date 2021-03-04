package com.augustomteixeira.validacaocustumizada.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.augustomteixeira.validacaocustumizada.model.list.TipoPassaTempo;

@Repository
public interface TipoPassaTempoRepository extends JpaRepository<TipoPassaTempo, Integer> {

}
