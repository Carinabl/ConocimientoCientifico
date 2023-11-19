package com.Grupo2.ConocimientoCientifico.Service;

import com.Grupo2.ConocimientoCientifico.Modelo.CertificadoAptitudTecnica;

import java.util.List;
public interface ICertificadoDeAptitudTecnicaService {

    public List<CertificadoAptitudTecnica> getCertificadoAptitudTecnica();
    public void saveCertificadoAptitudTecnica(CertificadoAptitudTecnica of);

    public void deleteCertificadoAptitudTecnica(Long id);
    public CertificadoAptitudTecnica buscarCertificadoAptitudTecnica(long id);
}
