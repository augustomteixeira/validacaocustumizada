package com.augustomteixeira.validacaocustumizada.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.augustomteixeira.validacaocustumizada.model.list.TipoEntretenimento;

@Repository
public interface TipoEntretenimentoRepository extends JpaRepository<TipoEntretenimento, Integer> {
	
	@Query(value = "select * from listas.tipo_entretenimento", nativeQuery = true)
	List<TipoEntretenimento> buscarTiposDeEntretenimento();

}
