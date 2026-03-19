package cl.duoc.biblioteca_duoc.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import cl.duoc.biblioteca_duoc.model.Libro;

@Repository
public class LibroRepositorio {

    private List<Libro> listaLibros = new ArrayList<>();

    private LibroRepositorio() {
        listaLibros.add(new Libro(1, "El Quijote", "Miguel de Cervantes", "978-3-16-148410-0", LocalDate.of(1605, 1, 16), "Editorial A"));
        listaLibros.add(new Libro(2, "Cien Años de Soledad", "Gabriel García Márquez", "978-3-16-148410-1", LocalDate.of(1967, 5, 30), "Editorial B"));
        listaLibros.add(new Libro(3, "La Sombra del Viento", "Carlos Ruiz Zafón", "978-3-16-148410-2", LocalDate.of(2001, 4, 12), "Editorial C"));
        listaLibros.add(new Libro(4, "978-84-233-4233-5", "Rayuela", "Sudamericana", LocalDate.of(1963, 6, 28), "Julio Cortázar"));
        listaLibros.add(new Libro(5, "978-84-670-5974-2", "El amor en los tiempos del cólera", "Debolsillo", LocalDate.of(1985, 9, 5), "Gabriel García Márquez"));
    }

    public List<Libro> findAll() {
        return listaLibros;
    }
}