package com.Grupo2.ConocimientoCientifico.Modelo;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
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
public class Autor {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    @Basic
    private String nombre;
    private String apellido;

    @OneToOne
    private ReunionCientifica reunionCientifica;

    @ManyToMany
    @JoinTable(
        name = "ArticuloConReferato_Autor",
        joinColumns = @JoinColumn(name = "id_ArticuloConReferato"),
        inverseJoinColumns = @JoinColumn(name = "id_Autor")
    )
    private ArticuloConReferato autorConReferato;

    @OneToMany
    @JoinColumn (name="id_publicacion")
    private Publicacion publicacion;

    @OneToOne
    @JoinColumn (name="id_Trabajo")
    private Trabajo trabajo;

}
