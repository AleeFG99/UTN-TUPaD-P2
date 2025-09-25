/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio7;

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
        Motor motor = new Motor("V8", "MTR-98765");
        Vehiculo vehiculo = new Vehiculo("AB123CD", "Toyota Corolla", motor);
        Conductor conductor = new Conductor("Juan Pérez", "LIC-445566");

        // Asociación bidireccional
        vehiculo.setConductor(conductor);

        // Mostrar datos
        System.out.println(vehiculo);
        System.out.println("Conductor del vehículo: " + vehiculo.getConductor());
        System.out.println("Vehículo del conductor: " + conductor.getVehiculo());
    }
    
}
