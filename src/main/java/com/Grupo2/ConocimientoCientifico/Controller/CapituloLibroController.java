package com.Grupo2.ConocimientoCientifico.Controller;

import com.Grupo2.ConocimientoCientifico.Modelo.CapituloLibro;
import com.Grupo2.ConocimientoCientifico.Service.ICapituloLibroService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("autor")
public class CapituloLibroController {
    @Autowired
    private ICapituloLibroService capituloLibroI;

    @GetMapping("/consulta")
    public List<CapituloLibro> getCapituloLibro(){

        return capituloLibroI.getCapituloLibro();
    }

    @PostMapping("/alta")
    public String saveCapituloLibro(@RequestBody CapituloLibro of){
        capituloLibroI.saveCapituloLibro(of);
        return "Se creo el Capitulo del libro Correctamente";
    }

    @DeleteMapping("/baja/{id}")
    public String deleteCapituloLibro(@PathVariable Long id) {
        capituloLibroI.deleteCapituloLibro(id);
        return " Capitulo del libro Eliminado";
    }

    @PutMapping ("/editar/{id}")
    public CapituloLibro editarCapituloLibro(@PathVariable Long id,
                             @RequestParam("nombreCapitulo") String nuevoNombreCapitulo)
    {
        CapituloLibro capituloLibro = capituloLibroI.buscarCapituloLibro(0);
        capituloLibro.setNombreCapitulo(nuevoNombreCapitulo);

        capituloLibroI.saveCapituloLibro(capituloLibro);

        return capituloLibro;
    }
}
