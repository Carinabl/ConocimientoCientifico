package com.Grupo2.ConocimientoCientifico.Service;

import com.Grupo2.ConocimientoCientifico.Modelo.Libro;
import com.Grupo2.ConocimientoCientifico.Repository.LibroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService implements ILibro {
    @Autowired
    private LibroRepository libroR;

    @Override
    public List<Libro> getLibro() {
        List<Libro> listaLibro;
        listaLibro = libroR.findAll();
        return listaLibro;
    }

    @Override
    public void saveLibro(Libro of) {
        libroR.save(of);
    }

    @Override
    public void deleteLibro(Long id) {
        libroR.deleteById(id);
    }

    @Override
    public Libro buscarLibro(long id) {
        Libro libro;
        libro = libroR.findById(id).orElse(null);
        return libro;
    }
}