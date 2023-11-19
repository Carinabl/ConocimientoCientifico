package com.Grupo2.ConocimientoCientifico.Controller;

import java.util.List;

import com.Grupo2.ConocimientoCientifico.Modelo.Autor;
import com.Grupo2.ConocimientoCientifico.Service.IAutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("autor")
public class AutorController {
    @Autowired
    private IAutorService autorI;

    @GetMapping("/consulta")
    public List<Autor> getAutor(){

        return autorI.getAutor();
    }

    @PostMapping("/alta")
    public String saveAutor(@RequestBody Autor of){
        autorI.saveAutor(of);
        return "Se creo el Autor Correctamente";
    }

    @DeleteMapping("/baja/{id}")
    public String deleteAutor(@PathVariable Long id) {
        autorI.deleteAutor(id);
        return " Autor Eliminado";
    }

    @PutMapping ("/editar/{id}")
    public Autor editarAutor(@PathVariable Long id,
                             @RequestParam("nombre") String nuevoNombre,
                             @RequestParam("apellido") String nuevoApellido)
    {
        Autor autor = autorI.buscarAutor(0);
        autor.setNombre(nuevoNombre);
        autor.setApellido(nuevoApellido);

        autorI.saveAutor(autor);

        return autor;
    }
}