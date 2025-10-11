/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico3;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Ale
 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;
    
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }
    
    // Getters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    public List<Curso> getCursos() { return new ArrayList<>(cursos); } // Copia defensiva
    
    // Agregar curso (sincronización bidireccional)
    public void agregarCurso(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
            // Sincronizar el lado del curso
            if (curso.getProfesor() != this) {
                curso.setProfesor(this);
            }
        }
    }
    
    // Eliminar curso (sincronización bidireccional)
    public void eliminarCurso(Curso curso) {
        if (cursos.remove(curso)) {
            // Sincronizar el lado del curso
            if (curso.getProfesor() == this) {
                curso.setProfesor(null);
            }
        }
    }
    
    // Listar cursos
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println(nombre + " no dicta ningún curso.");
            return;
        }
        System.out.println("\nCursos dictados por " + nombre + ":");
        for (Curso curso : cursos) {
            System.out.println("- " + curso.getCodigo() + ": " + curso.getNombre());
        }
    }
    
    // Mostrar información
    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + " (ID: " + id + 
                          "), Especialidad: " + especialidad + 
                          ", Cursos: " + cursos.size());
    }
    
    @Override
    public String toString() {
        return nombre + " (" + especialidad + ")";
    }
    
}
