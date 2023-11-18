package com.Grupo2.ConocimientoCientifico.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Grupo2.ConocimientoCientifico.Modelo.ComunicacionCientifica;


@Repository
public interface ComunicacionCientificaRepository extends JpaRepository <ComunicacionCientifica, Long>{
    
}
