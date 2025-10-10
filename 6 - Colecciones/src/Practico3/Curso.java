/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico3;

/**
 *
 * @author Ale
 */
public class Curso {
      private String codigo;
    private String nombre;
    private Profesor profesor;
    
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }
    
    // Getters
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }
    
    // Setter de profesor con sincronización bidireccional
    public void setProfesor(Profesor nuevoProfesor) {
        // Si ya tenía un profesor, quitarnos de su lista
        if (this.profesor != null && this.profesor != nuevoProfesor) {
            this.profesor.eliminarCurso(this);
        }
        
        // Asignar nuevo profesor
        this.profesor = nuevoProfesor;
        
        // Agregarnos a la lista del nuevo profesor
        if (nuevoProfesor != null && !nuevoProfesor.getCursos().contains(this)) {
            nuevoProfesor.agregarCurso(this);
        }
    }
    
    // Mostrar información
    public void mostrarInfo() {
        String profesorInfo = (profesor != null) ? profesor.getNombre() : "Sin asignar";
        System.out.println("Curso: " + nombre + " (" + codigo + ") | Profesor: " + profesorInfo);
    }
    
    @Override
    public String toString() {
        return codigo + ": " + nombre;
    }
    
}
