package com.Grupo2.ConocimientoCientifico.Service;

import com.Grupo2.ConocimientoCientifico.Modelo.RegistroPropiedadIndustrial;

import java.util.List;


public interface IRegistroPropiedadIndustrial {
    public List<RegistroPropiedadIndustrial> getRegistroPropiedadIndustrial();
    public void saveRegistroPropiedadIndustrial(RegistroPropiedadIndustrial of);
    public void deleteRegistroPropiedadIndustrial(Long id);
    public RegistroPropiedadIndustrial buscarRegistroPropiedadIndustrial(Long id);
}
