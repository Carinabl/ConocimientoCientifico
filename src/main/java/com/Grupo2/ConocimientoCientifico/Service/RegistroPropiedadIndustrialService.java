package com.Grupo2.ConocimientoCientifico.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Grupo2.ConocimientoCientifico.Modelo.RegistroPropiedadIndustrial;
import com.Grupo2.ConocimientoCientifico.Repository.RegistroPropiedadIndustrialRepository;

import java.util.List;

@Service


public class RegistroPropiedadIndustrialService implements IRegistroPropiedadIndustrial {
    @Autowired
    private RegistroPropiedadIndustrialRepository registroPropiedadIndustrialR;

    @Override
    public List<RegistroPropiedadIndustrial> getRegistroPropiedadIndustrial() {
       List<RegistroPropiedadIndustrial> listaRegistroPropiedadIndustrial = registroPropiedadIndustrialR.findAll();
        return listaRegistroPropiedadIndustrial;
    }
    
    @Override
    public void saveRegistroPropiedadIndustrial(RegistroPropiedadIndustrial of) {
        registroPropiedadIndustrialR.save(of);
    }

    @Override
    public void deleteRegistroPropiedadIndustrial(Long id){
        registroPropiedadIndustrialR.deleteById(id);
    }

    @Override
    public RegistroPropiedadIndustrial buscarRegistroPropiedadIndustrial(Long id){
        RegistroPropiedadIndustrial registroPropiedadIndustrial = registroPropiedadIndustrialR.findById(id).orElse(null);
        return registroPropiedadIndustrial;
    }
}
