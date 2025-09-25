/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author Ale
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;        // Agregación
    private Conductor conductor; // Asociación bidireccional

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        conductor.setVehiculo(this); // asegura la bidireccionalidad
    }

    public Conductor getConductor() {
        return conductor;
    }

    public Motor getMotor() {
        return motor;
    }

    @Override
    public String toString() {
        return "Vehiculo[patente=" + patente + 
               ", modelo=" + modelo + 
               ", motor=" + motor + "]";
    }
    
}
