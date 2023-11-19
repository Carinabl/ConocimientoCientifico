package com.Grupo2.ConocimientoCientifico.Service;

import com.Grupo2.ConocimientoCientifico.Modelo.CertificadoAptitudTecnica;
import com.Grupo2.ConocimientoCientifico.Repository.CertificadoAptitudTecnicaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificadoAptitudTecnicaService implements ICertificadoDeAptitudTecnicaService{
    @Autowired
    private CertificadoAptitudTecnicaRepository certificadoATR;

    @Override
    public List<CertificadoAptitudTecnica> getCertificadoAptitudTecnica() {
        List<CertificadoAptitudTecnica> listaCertificadosAT = certificadoATR.findAll();
        return listaCertificadosAT;
    }

    @Override
    public void saveCertificadoAptitudTecnica(CertificadoAptitudTecnica of) {

        certificadoATR.save(of);
    }

    @Override
    public void deleteCertificadoAptitudTecnica(Long id) {

        certificadoATR.deleteById(id);
    }

    @Override
    public CertificadoAptitudTecnica buscarCertificadoAptitudTecnica(long id) {
        CertificadoAptitudTecnica certificadoAT= certificadoATR.findById(id).orElse(null);
        return certificadoAT;
    }
}
