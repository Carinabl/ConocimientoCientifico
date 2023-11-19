package com.Grupo2.ConocimientoCientifico.Modelo;

import java.sql.Date;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Data
public class CertificadoAptitudTecnica {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    @Basic
    private String aptitudDelEmpleo;
    @Temporal(TemporalType.DATE)
    private Date vencimiento;
    private String denominacionComercial;
    private String direccion;
    private String email;
    private String numCat;
    private String telefono;
    private String titular;
}
