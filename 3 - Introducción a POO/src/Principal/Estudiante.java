/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author Ale
 */
public class Estudiante {
     // Atributos
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    // Constructor
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }

    // Método para subir calificación
    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        System.out.println("La calificación de " + nombre + " aumentó a " + calificacion);
    }

    // Método para bajar calificación
    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        if (calificacion < 0) {
            calificacion = 0; // No permitir calificación negativa
        }
        System.out.println("La calificación de " + nombre + " disminuyó a " + calificacion);
    }

    // Getters y Setters (opcional, si necesitas manipular atributos desde fuera)
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getCurso() { return curso; }
    public double getCalificacion() { return calificacion; }

    
}


    
