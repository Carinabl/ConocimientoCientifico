package com.Grupo2.ConocimientoCientifico.Service;

import com.Grupo2.ConocimientoCientifico.Modelo.Evento;

import java.util.List;
public interface IEventoService {

    public List<Evento> getEvento();
    public void saveEvento(Evento of);

    public void deleteEvento(Long id);
    public Evento buscarEvento(long id);
}
