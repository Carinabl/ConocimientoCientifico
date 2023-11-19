package com.Grupo2.ConocimientoCientifico.Controller;

import com.Grupo2.ConocimientoCientifico.Modelo.Libro;
import com.Grupo2.ConocimientoCientifico.Service.ILibro;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("libro")
public class LibroController {
    @Autowired
    private ILibro libroI;

    @GetMapping("/consulta")
    public List<Libro> getLibro(){

        return libroI.getLibro();
    }

    @PostMapping("/alta")
    public String saveLibro(@RequestBody Libro of){
        libroI.saveLibro(of);
        return "Se creo el libro Correctamente";
    }

    @DeleteMapping("/baja/{id}")
    public String deleteLibro(@PathVariable Long id) {
        libroI.deleteLibro(id);
        return " Capitulo del libro Eliminado";
    }

    @PutMapping ("/editar/{id}")
    public Libro editarLibro(@PathVariable Long id,
                             @RequestParam("nombreLibro") String nuevoNombreLibro)
    {
        Libro libro = libroI.buscarLibro(0);
        libro.setNombreLibro(nuevoNombreLibro);

        libroI.saveLibro(libro);

        return libro;
    }
}

