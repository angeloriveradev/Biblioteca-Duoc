package cl.duoc.biblioteca_duoc.controller;

import cl.duoc.biblioteca_duoc.model.Libro;
import cl.duoc.biblioteca_duoc.service.LibroService;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/libros")
@AllArgsConstructor
public class LibroControlador {

    private LibroService libroServicio;

    @GetMapping
    public List<Libro> obtenerTodosLosLibros() {
        return libroServicio.obtenerTodosLosLibros();
    }
}