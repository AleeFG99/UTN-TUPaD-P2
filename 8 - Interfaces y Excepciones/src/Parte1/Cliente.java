/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1;

/**
 *
 * @author Ale
 */
public class Cliente implements Notificable {
    private String nombre;
    private String email;
    
    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    
    @Override
    public void notificar(String mensaje) {
        System.out.printf("Notificación para %s (%s): %s%n", nombre, email, mensaje);
    }
    
    // Getters
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
    
    @Override
    public String toString() {
        return String.format("Cliente: %s (%s)", nombre, email);
    }
    
    
}
