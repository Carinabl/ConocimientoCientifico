package com.Grupo2.ConocimientoCientifico.Service;

import com.Grupo2.ConocimientoCientifico.Modelo.Autor;
import com.Grupo2.ConocimientoCientifico.Repository.AutorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService implements IAutorService{
    @Autowired
    private AutorRepository autorR;

    @Override
    public List<Autor> getAutor() {
        List<Autor> listaAutores = autorR.findAll();
        return listaAutores;
    }

    @Override
    public void saveAutor(Autor of) {
        autorR.save(of);
    }

    @Override
    public void deleteAutor(Long id) {
        autorR.deleteById(id);
    }

    @Override
    public Autor buscarAutor(long id) {
        Autor autor= autorR.findById(id).orElse(null);
        return autor;
    }
}
