package controller;

import model.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import service.LibroService;

@RestController
@RequestMapping("/api/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    // Otros métodos del controlador

    @GetMapping("/buscar-gutendex")
    public Flux<Libro> buscarLibrosEnGutendex(@RequestParam String query) {
        return libroService.buscarLibrosEnGutendex();
    }
}

