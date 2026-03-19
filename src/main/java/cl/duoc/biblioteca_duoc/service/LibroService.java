package cl.duoc.biblioteca_duoc.service;

import java.util.List;

import org.springframework.stereotype.Service;
import cl.duoc.biblioteca_duoc.model.Libro;
import cl.duoc.biblioteca_duoc.repository.LibroRepositorio;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LibroService {

    private LibroRepositorio libroRepositorio;

    public List<Libro> obtenerTodosLosLibros() {
        return libroRepositorio.findAll();
    }
}