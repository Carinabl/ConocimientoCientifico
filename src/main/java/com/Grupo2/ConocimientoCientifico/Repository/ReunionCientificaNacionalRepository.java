package com.Grupo2.ConocimientoCientifico.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Grupo2.ConocimientoCientifico.Modelo.ReunionCientificaNacional;

@Repository
public interface ReunionCientificaNacionalRepository extends JpaRepository <ReunionCientificaNacional, Long>{
    
}
