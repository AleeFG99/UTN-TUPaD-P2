/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practico2;

/**
 *
 * @author Ale
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("=== SISTEMA DE GESTIÓN DE BIBLIOTECA ===\n");
        
        // 1. Crear biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        
        // 2. Crear al menos tres autores
        Autor autor1 = new Autor("A001", "Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("A002", "Isabel Allende", "Chilena");
        Autor autor3 = new Autor("A003", "Jorge Luis Borges", "Argentina");
        Autor autor4 = new Autor("A004", "Mario Vargas Llosa", "Peruana");
        
        // 3. Agregar 5 libros
        biblioteca.agregarLibro("ISBN001", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("ISBN002", "El amor en los tiempos del cólera", 1985, autor1);
        biblioteca.agregarLibro("ISBN003", "La casa de los espíritus", 1982, autor2);
        biblioteca.agregarLibro("ISBN004", "Ficciones", 1944, autor3);
        biblioteca.agregarLibro("ISBN005", "La ciudad y los perros", 1963, autor4);
        
        // 4. Listar todos los libros
        biblioteca.listarLibros();
        
        // 5. Buscar libro por ISBN
        System.out.println("\n=== BUSCAR LIBRO POR ISBN ===");
        Libro libroBuscado = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (libroBuscado != null) {
            libroBuscado.mostrarInfo();
        }
        
        // 6. Filtrar libros por año específico
        biblioteca.filtrarLibrosPorAnio(1985);
        
        // 7. Eliminar libro por ISBN y listar restantes
        System.out.println("\n=== ELIMINAR LIBRO ===");
        biblioteca.eliminarLibro("ISBN005");
        biblioteca.listarLibros();
        
        // 8. Mostrar cantidad total de libros
        System.out.println("\nCantidad total de libros: " + biblioteca.obtenerCantidadLibros());
        
        // 9. Listar todos los autores
        biblioteca.mostrarAutoresDisponibles();
    }
    
}
