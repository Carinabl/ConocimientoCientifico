package com.Grupo2.ConocimientoCientifico.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Grupo2.ConocimientoCientifico.Modelo.ArticuloConReferato;
import com.Grupo2.ConocimientoCientifico.Repository.ArticuloConReferatoRepository;

import java.util.List;

@Service
public class ArticuloConReferatoService implements IArticuloConReferato {
    
    @Autowired 
    private ArticuloConReferatoRepository articuloConReferatoR;

    @Override
    public List<ArticuloConReferato> getArticuloConReferato() {
        List<ArticuloConReferato> listaArticuloConReferato = articuloConReferatoR.findAll();
        return listaArticuloConReferato;
    }

    @Override
    public void saveArticuloConReferato(ArticuloConReferato of) {
        articuloConReferatoR.save(of);
    }

    @Override
    public void deleteArticuloConReferato(Long id) {
        ArticuloConReferatoR.deleteById(id);
    }

    @Override
    public ArticuloConReferato buscarArticuloConReferato(long id) {
         ArticuloConReferato ArticuloConReferatoBuscado = ArticuloConReferatoR.findById(id).orElse(null);// aca deberia implemenarse una logica para devolver algun mensaje
        return ArticuloConReferatoBuscado;
    }
  
}
