package com.Grupo2.ConocimientoCientifico.Modelo;

import java.sql.Date;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Data
public class RegistroPropiedadIntelectual {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    @Basic
    private String diseños;
    private String modelosDeUtilidad;
    private String modelosIndustriales;
    private String nombrePropiedad;
    private String patenteDeInvencion;
    private String titularPropiedad;

    
    @OneToOne
    @JoinColumn (name="id_Marca")
    private Marca marca;
   
}
