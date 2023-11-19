package com.Grupo2.ConocimientoCientifico.Controller;

import java.util.Date;
import java.util.List;

import com.Grupo2.ConocimientoCientifico.Modelo.CertificadoAptitudTecnica;
import com.Grupo2.ConocimientoCientifico.Service.ICertificadoDeAptitudTecnicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("certificadoAptitudTecnica")
public class CertificadoAptitudTecnicaController {
    @Autowired
    private ICertificadoDeAptitudTecnicaService certificadoATI;

    @GetMapping("/consulta")
    public List<CertificadoAptitudTecnica> getCertificadoAptitudTecnica(){

        return certificadoATI.getCertificadoAptitudTecnica();
    }

    @PostMapping("/alta")
    public String saveCertificadoAptitudTecnica(@RequestBody CertificadoAptitudTecnica of){
        certificadoATI.saveCertificadoAptitudTecnica(of);
        return "Se creo el Certificado de aptitud técnica Correctamente";
    }

    @DeleteMapping("/baja/{id}")
    public String deleteCertificadoAptitudTecnica(@PathVariable Long id) {
        certificadoATI.deleteCertificadoAptitudTecnica(id);
        return " Certificado de aptitud técnica Eliminado";
    }

    @PutMapping ("/editar/{id}")
    public CertificadoAptitudTecnica editarCertificadoAptitudTecnica(@PathVariable Long id,
                                                                     @RequestParam("aptitudDelEmpleo") String nuevaAptitudDelEmpleo,
                                                                     @RequestParam("vencimiento") @DateTimeFormat(pattern = "dd-MM-yyyy") Date nuevoVencimiento,
                                                                     @RequestParam("denominacionComercial") String nuevaDenominacionComercial ,
                                                                     @RequestParam("direccion") String nuevaDireccion,
                                                                     @RequestParam("email") String nuevoemail,
                                                                     @RequestParam("numCat") String nuevoNumCat,
                                                                     @RequestParam("telefono") String nuevoTelefono,
                                                                     @RequestParam("titular") String nuevoTitular
    )
    {
        CertificadoAptitudTecnica certificadoAT = certificadoATI.buscarCertificadoAptitudTecnica(0);
        certificadoAT.setAptitudDelEmpleo(nuevaAptitudDelEmpleo);
        java.sql.Date ConvertirASql = new java.sql.Date(nuevoVencimiento.getTime());
        certificadoAT.setVencimiento(ConvertirASql);
        certificadoAT.setDenominacionComercial(nuevaDenominacionComercial);
        certificadoAT.setDireccion(nuevaDireccion);
        certificadoAT.setEmail(nuevoemail);
        certificadoAT.setNumCat(nuevoNumCat);
        certificadoAT.setTelefono(nuevoTelefono);
        certificadoAT.setTitular(nuevoTitular);
        
        certificadoATI.saveCertificadoAptitudTecnica(certificadoAT);

        return certificadoAT;
    }
}
