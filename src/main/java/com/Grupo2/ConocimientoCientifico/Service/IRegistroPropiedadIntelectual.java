package com.Grupo2.ConocimientoCientifico.Service;

import com.Grupo2.ConocimientoCientifico.Modelo.RegistroPropiedadIntelectual;

import java.util.List;


public interface IRegistroPropiedadIntelectual {
    public List<RegistroPropiedadIntelectual> getRegistroPropiedadIntelectual();
    public void saveRegistroPropiedadIntelectual(RegistroPropiedadIntelectual of);
    public void deleteRegistroPropiedadIntelectual(Long id);
    public RegistroPropiedadIntelectual buscarRegistroPropiedadIntelectual(Long id);
}
