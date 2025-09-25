/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3;

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
         Autor autor = new Autor("Gabriel García Márquez", "Colombiana");
        Editorial editorial = new Editorial("Sudamericana", "Buenos Aires, Argentina");

        Libro libro = new Libro("Cien años de soledad", "978-3-16-148410-0", autor, editorial);

        System.out.println(libro);
        System.out.println("Autor del libro: " + libro.getAutor());
        System.out.println("Editorial: " + libro.getEditorial());
    }
    
}
