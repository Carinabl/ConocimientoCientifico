package com.Grupo2.ConocimientoCientifico.Modelo;

import java.sql.Date;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
public class RegistroPropiedadIndustrial {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    @Basic
    private String nombrePropiedad;
    private String tipoLicencia; //Es un enum en el diagrama de clases
    private String titularPropiedad;
    
    @OneToOne
    @JoinColumn (name="id_marca")
    private Marca marca;
   
}
