package com.augustomteixeira.validacaocustumizada.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.augustomteixeira.validacaocustumizada.model.list.CampoTipoEntretenimento;

@Repository
public interface CampoTipoEntretenimentoRepository extends JpaRepository<CampoTipoEntretenimento, Integer> {

	@Query(value = "select cte.descricao as campo, ceo.obrigatorio "
			+ "from listas.campo_entretenimento_obrigatoriedade ceo "
			+ "left outer join listas.campo_tipo_entretenimento cte on cte.id_campo_tipo_entretenimento = ceo.fk_campo_tipo_entretenimento "
			+ "left outer join listas.tipo_entretenimento te on te.id_tipo_entretenimento = ceo.fk_tipo_entretenimento "
			+ "where te.id_tipo_entretenimento=?1",
		   nativeQuery = true)
	List<Object[]> campoObrigatorioPorTipoEntretenimento(Integer idTipoEntretenimento);

}
