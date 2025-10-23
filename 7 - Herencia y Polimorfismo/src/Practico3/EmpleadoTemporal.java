/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico3;

/**
 *
 * @author Ale
 */
public class EmpleadoTemporal extends Empleado {
     private double horasExtras;
    private double tarifaHoraExtra;
    
    public EmpleadoTemporal(String nombre, double salarioBase, 
                           double horasExtras, double tarifaHoraExtra) {
        super(nombre, salarioBase);
        this.horasExtras = horasExtras;
        this.tarifaHoraExtra = tarifaHoraExtra;
    }
    
    @Override
    public double calcularSueldo() {
        return salarioBase + (horasExtras * tarifaHoraExtra);
    }
    
}
