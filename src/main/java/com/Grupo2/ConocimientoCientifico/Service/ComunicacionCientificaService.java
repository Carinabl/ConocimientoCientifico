package com.Grupo2.ConocimientoCientifico.Service;

import com.Grupo2.ConocimientoCientifico.Modelo.ComunicacionCientifica;
import com.Grupo2.ConocimientoCientifico.Repository.ComunicacionCientificaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComunicacionCientificaService implements IComunicacionCientificaService {
    @Autowired
    private ComunicacionCientificaRepository comunicacionCientificaR;

    @Override
    public List<ComunicacionCientifica> getComunicacionCientifica() {
        List<ComunicacionCientifica> listaCapitulosLibro;
        listaCapitulosLibro = comunicacionCientificaR.findAll();
        return listaCapitulosLibro;
    }

    @Override
    public void saveComunicacionCientifica(ComunicacionCientifica of) {
        comunicacionCientificaR.save(of);
    }

    @Override
    public void deleteComunicacionCientifica(Long id) {
        comunicacionCientificaR.deleteById(id);
    }

    @Override
    public ComunicacionCientifica buscarComunicacionCientifica(long id) {
        ComunicacionCientifica comunicacionCientifica;
        comunicacionCientifica = comunicacionCientificaR.findById(id).orElse(null);
        return comunicacionCientifica;
    }
}
