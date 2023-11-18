package com.Grupo2.ConocimientoCientifico.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Grupo2.ConocimientoCientifico.Modelo.CertificadoAptitudTecnica;

@Repository
public interface CertificadoAptitudTecnicaRepository extends JpaRepository <CertificadoAptitudTecnica, Long>{
    
}
