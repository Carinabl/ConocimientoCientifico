package com.Grupo2.ConocimientoCientifico.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Grupo2.ConocimientoCientifico.Modelo.RegistroPropiedadIntelectual;
import com.Grupo2.ConocimientoCientifico.Repository.RegistroPropiedadIntelectualRepository;

import java.util.List;

@Service


public class RegistroPropiedadIntelectualService implements IRegistroPropiedadIntelectual {
    @Autowired
    private RegistroPropiedadIntelectualRepository registroPropiedadIntelectualR;

    @Override
    public List<RegistroPropiedadIntelectual> getRegistroPropiedadIntelectual() {
       List<RegistroPropiedadIntelectual> listaRegistroPropiedadIntelectual = registroPropiedadIntelectualR.findAll();
        return listaRegistroPropiedadIntelectual;
    }
    
    @Override
    public void saveRegistroPropiedadIntelectual(RegistroPropiedadIntelectual of) {
        registroPropiedadIntelectualR.save(of);
    }

    @Override
    public void deleteRegistroPropiedadIntelectual(Long id){
        registroPropiedadIntelectualR.deleteById(id);
    }

    @Override
    public RegistroPropiedadIntelectual buscarRegistroPropiedadIntelectual(Long id){
        RegistroPropiedadIntelectual registroPropiedadIntelectual = registroPropiedadIntelectualR.findById(id).orElse(null);
        return registroPropiedadIntelectual;
    }
}
