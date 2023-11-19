package com.Grupo2.ConocimientoCientifico.Service;

import com.Grupo2.ConocimientoCientifico.Modelo.CapituloLibro;
import com.Grupo2.ConocimientoCientifico.Repository.CapituloLibroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CapituloLibroService implements ICapituloLibroService {
    @Autowired
    private CapituloLibroRepository capituloLibroR;

    @Override
    public List<CapituloLibro> getCapituloLibro() {
        List<CapituloLibro> listaCapitulosLibro;
        listaCapitulosLibro = capituloLibroR.findAll();
        return listaCapitulosLibro;
    }

    @Override
    public void saveCapituloLibro(CapituloLibro of) {
        capituloLibroR.save(of);
    }

    @Override
    public void saveCApituloLibro(CapituloLibro of) {
        capituloLibroR.save(of);
    }

    @Override
    public void deleteCapituloLibro(Long id) {
        capituloLibroR.deleteById(id);
    }

    @Override
    public CapituloLibro buscarCapituloLibro(long id) {
        CapituloLibro capituloLibro;
        capituloLibro = capituloLibroR.findById(id).orElse(null);
        return capituloLibro;
    }
}
