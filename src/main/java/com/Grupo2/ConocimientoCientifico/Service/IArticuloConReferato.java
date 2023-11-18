package com.Grupo2.ConocimientoCientifico.Service;

import com.Grupo2.ConocimientoCientifico.Modelo.ArticuloConReferato;

import java.util.List;

public interface IArticuloConReferato {

    public List<ArticuloConReferato> getArticuloConReferato();
    public void saveArticuloConReferato(ArticuloConReferato of);
    public void deleteArticuloConReferato(Long id);
    public ArticuloConReferato buscarArticuloConReferato(long id);

} 
