package com.Grupo2.ConocimientoCientifico.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Grupo2.ConocimientoCientifico.Modelo.CapituloLibro;

@Repository
public interface CapituloLibroRepository extends JpaRepository <CapituloLibro, Long>{
    
}
