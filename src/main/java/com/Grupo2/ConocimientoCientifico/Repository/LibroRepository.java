package com.Grupo2.ConocimientoCientifico.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Grupo2.ConocimientoCientifico.Modelo.Libro;


@Repository
public interface LibroRepository extends JpaRepository <Libro, Long>{
    
}
