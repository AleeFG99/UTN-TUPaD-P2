/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author Ale
 */
public class Mascota {
      // Atributos
    private String nombre;
    private String especie;
    private int edad;
    
    // Constructor
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
    // Métodos
    public void mostrarInfo() {
        System.out.println("Mascota: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
        System.out.println("-----------------------------");
    }
    
    public void cumplirAnios() {
        edad++;
        System.out.println("¡" + nombre + " ha cumplido años! Ahora tiene " + edad + " años.");
    }
    
    // Getter para edad
    public int getEdad() {
        return edad;
    }
}
