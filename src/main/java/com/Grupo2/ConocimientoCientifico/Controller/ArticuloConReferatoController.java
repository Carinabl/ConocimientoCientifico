package com.Grupo2.ConocimientoCientifico.Controller;

import com.Grupo2.ConocimientoCientifico.Modelo.ArticuloConReferato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("articuloConReferato")
public class ArticuloConReferatoController {

    @Autowired
    private IArticuloConReferatoService articuloConReferatoI;

    @GetMapping("/consulta")
    public List<ArticuloConReferato> getArticuloConReferato(){
        return articuloConReferatoI.getArticuloConReferato();
    }
    //@RolesAllowed("SYS_ADMIN")
    @PostMapping("/alta")
    public String saveArticuloConReferato(@RequestBody ArticuloConReferato of){
        ArticuloConReferatoI.saveArticuloConReferato(of);
        return "Se creo el ArticuloConReferato Correctamente";
    }

    @DeleteMapping("/baja/{id}")
    public String deleteArticuloConReferato(@PathVariable Long id) {
        ArticuloConReferatoI.deleteArticuloConReferato(id);
        return " Articulo con referato Eliminada";
    }

    @PutMapping ("/editar/{id}")
    public ArticuloConReferato editarArticuloConReferato(@PathVariable Long id,
                               @RequestParam("lugar") String nuevalugar,
                               @RequestParam("nombreArticulo") String nuevoArticulo,
                               @RequestParam("fecha") @DateTimeFormat(pattern = "dd-MM-yyyy") Date nuevaFecha){


        ArticuloConReferato articuloConReferato = articuloConReferatoI.buscarArticuloConReferato(0);
        articuloConReferato.setSLugar(nuevoArticuloConReferato);
        articuloConReferato.setNombreArticulo(nuevoNombreArticulo);
        java.sql.Date ConvertirASql = new java.sql.Date(nuevaFecha.getTime());
        articuloConReferato.setFecha(ConvertirASql);

        articuloConReferatoI.saveArticuloConReferato(articuloConReferato);

        return articuloConReferato;
    }








}