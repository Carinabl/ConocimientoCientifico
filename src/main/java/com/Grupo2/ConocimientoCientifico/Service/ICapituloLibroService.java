package com.Grupo2.ConocimientoCientifico.Service;

import com.Grupo2.ConocimientoCientifico.Modelo.CapituloLibro;

import java.util.List;

public interface ICapituloLibroService {
    public List<CapituloLibro> getCapituloLibro();
    public void saveCapituloLibro(CapituloLibro of);

    void saveCApituloLibro(CapituloLibro of);

    public void deleteCapituloLibro(Long id);
    public CapituloLibro buscarCapituloLibro(long id);
}
