package com.Grupo2.ConocimientoCientifico.Service;

import com.Grupo2.ConocimientoCientifico.Modelo.ArticuloConReferato;

public interface IArticuloConReferato {

    public List<ArticuloConReferato> getArticuloConReferato();
    public void saveOferta(ArticuloConReferato of);
    public void deleteOferta(Long id);
    public ArticuloConReferato buscarOferta(long id);

} 
