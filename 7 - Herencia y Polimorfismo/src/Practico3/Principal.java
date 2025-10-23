/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practico3;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ale
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // Crear lista de empleados
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Ana García", 2500, 300));
        empleados.add(new EmpleadoTemporal("Carlos López", 1800, 10, 25));
        empleados.add(new EmpleadoPlanta("María Rodríguez", 2800, 400));
        
        // Contadores para clasificación
        int contadorPlanta = 0;
        int contadorTemporal = 0;
        
        // Invocar calcularSueldo() polimórficamente y usar instanceof
        for (Empleado empleado : empleados) {
            double sueldo = empleado.calcularSueldo();
            System.out.println(empleado.getNombre() + " - Sueldo: $" + sueldo);
            
            // Clasificar usando instanceof
            if (empleado instanceof EmpleadoPlanta) {
                contadorPlanta++;
                System.out.println("  - Tipo: Empleado de Planta");
            } else if (empleado instanceof EmpleadoTemporal) {
                contadorTemporal++;
                System.out.println("  - Tipo: Empleado Temporal");
            }
        }
        
        System.out.println("\nResumen:");
        System.out.println("Empleados de Planta: " + contadorPlanta);
        System.out.println("Empleados Temporales: " + contadorTemporal);
    }
    
}
