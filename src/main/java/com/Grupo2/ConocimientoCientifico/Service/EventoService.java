package com.Grupo2.ConocimientoCientifico.Service;

import com.Grupo2.ConocimientoCientifico.Modelo.Evento;
import com.Grupo2.ConocimientoCientifico.Repository.EventoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoService implements IEventoService{
    @Autowired
    private EventoRepository eventoR;

    @Override
    public List<Evento> getEvento() {
        List<Evento> listaEventos = eventoR.findAll();
        return listaEventos;
    }

    @Override
    public void saveEvento(Evento of) {

        eventoR.save(of);
    }

    @Override
    public void deleteEvento(Long id) {

        eventoR.deleteById(id);
    }

    @Override
    public Evento buscarEvento(long id) {
        Evento evento;
        evento = eventoR.findById(id).orElse(null);
        return evento;
    }
}
