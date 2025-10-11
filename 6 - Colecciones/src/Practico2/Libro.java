/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico2;

/**
 *
 * @author Ale
 */
public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;
    
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }
    
    // Getters
    public String getIsbn() { return isbn; }
    public String getTitulo() { return titulo; }
    public int getAnioPublicacion() { return anioPublicacion; }
    public Autor getAutor() { return autor; }
    
    public void mostrarInfo() {
        System.out.println("Título: " + titulo + " | ISBN: " + isbn + 
                          " | Año: " + anioPublicacion + " | Autor: " + autor.getNombre());
    }
    
    @Override
    public String toString() {
        return "Libro{isbn='" + isbn + "', titulo='" + titulo + 
               "', año=" + anioPublicacion + ", autor=" + autor.getNombre() + "}";
    }
    
}
