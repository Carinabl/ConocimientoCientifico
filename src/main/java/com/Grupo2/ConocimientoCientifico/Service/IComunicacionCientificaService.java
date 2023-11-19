package com.Grupo2.ConocimientoCientifico.Service;

import com.Grupo2.ConocimientoCientifico.Modelo.ComunicacionCientifica;

import java.util.List;

public interface IComunicacionCientificaService {

    public List<ComunicacionCientifica> getComunicacionCientifica();
    public void saveComunicacionCientifica(ComunicacionCientifica of);
    public void deleteComunicacionCientifica(Long id);
    public ComunicacionCientifica buscarComunicacionCientifica(long id);

} 

