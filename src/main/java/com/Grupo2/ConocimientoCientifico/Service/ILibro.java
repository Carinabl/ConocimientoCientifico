package com.Grupo2.ConocimientoCientifico.Service;

import com.Grupo2.ConocimientoCientifico.Modelo.Libro;

import java.util.List;

public interface ILibro {

    public List<Libro> getLibro();
    public void saveLibro(Libro of);
    public void deleteLibro(Long id);
    public Libro buscarLibro(long id);

} 
