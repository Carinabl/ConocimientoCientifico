package com.Grupo2.ConocimientoCientifico.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Grupo2.ConocimientoCientifico.Modelo.Patente;


@Repository
public interface PatenteRepository extends JpaRepository <Patente, Long>{
    
}
