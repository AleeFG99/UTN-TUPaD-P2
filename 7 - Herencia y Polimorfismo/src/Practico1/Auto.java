/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico1;

/**
 *
 * @author Ale
 */
public class Auto extends Vehiculo{
     private int cantidadPuertas;
    
    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo); // Llamada al constructor de la superclase
        this.cantidadPuertas = cantidadPuertas;
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Reutilización del método de la superclase
        System.out.println("Cantidad de puertas: " + cantidadPuertas);
    }
    
}
