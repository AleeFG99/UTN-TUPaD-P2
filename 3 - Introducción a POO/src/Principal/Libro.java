/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author Ale
 */
public class Libro {
      // Atributos privados
    private String titulo;
    private String autor;
    private int añoPublicacion;
    
    // Constructor
    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAñoPublicacion(añoPublicacion); // Usar setter para validación
    }
    
    // Getters
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public int getAñoPublicacion() {
        return añoPublicacion;
    }
    
    // Setter con validación
    public void setAñoPublicacion(int añoPublicacion) {
        int añoActual = java.time.Year.now().getValue();
        if (añoPublicacion <= añoActual && añoPublicacion > 0) {
            this.añoPublicacion = añoPublicacion;
        } else {
            System.out.println("Error: Año de publicación inválido (" + añoPublicacion + ")");
        }
    }
    
    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + añoPublicacion);
        System.out.println("-----------------------------");
    }
    
}

