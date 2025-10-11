/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Ale
 */
public class Biblioteca {
     private String nombre;
    private List<Libro> libros;
    
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    
    // Agregar libro
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(libro);
        System.out.println("Libro agregado: " + titulo);
    }
    
    // Listar todos los libros
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        System.out.println("\n=== LIBROS EN " + nombre.toUpperCase() + " ===");
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }
    
    // Buscar libro por ISBN
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }
    
    // Eliminar libro por ISBN
    public boolean eliminarLibro(String isbn) {
        Libro libro = buscarLibroPorIsbn(isbn);
        if (libro != null) {
            libros.remove(libro);
            System.out.println("Libro eliminado: " + libro.getTitulo());
            return true;
        }
        System.out.println("Libro con ISBN " + isbn + " no encontrado.");
        return false;
    }
    
    // Obtener cantidad de libros
    public int obtenerCantidadLibros() {
        return libros.size();
    }
    
    // Filtrar libros por año
    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("\n=== LIBROS PUBLICADOS EN " + anio + " ===");
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay libros publicados en " + anio);
        }
    }
    
    // Mostrar autores disponibles
    public void mostrarAutoresDisponibles() {
        Set<Autor> autoresUnicos = new HashSet<>();
        for (Libro libro : libros) {
            autoresUnicos.add(libro.getAutor());
        }
        
        System.out.println("\n=== AUTORES DISPONIBLES ===");
        if (autoresUnicos.isEmpty()) {
            System.out.println("No hay autores registrados.");
        } else {
            for (Autor autor : autoresUnicos) {
                autor.mostrarInfo();
            }
        }
    }
    
}
