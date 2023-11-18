package com.Grupo2.ConocimientoCientifico.Service;

import com.Grupo2.ConocimientoCientifico.Modelo.ArticuloConReferato;
import com.Grupo2.ConocimientoCientifico.Modelo.Autor;

import java.util.List;

public interface IAutorService {
    public List<Autor> getAutor();
    public void saveAutor(Autor of);
    public void deleteAutor(Long id);
    public Autor buscarAutor(long id);
}
