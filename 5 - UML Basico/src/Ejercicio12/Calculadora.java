/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio12;

/**
 *
 * @author Ale
 */
public class Calculadora {
    // Dependencia de uso: recibe Impuesto como parámetro, no lo guarda como atributo
    public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto de $" + impuesto.getMonto() +
                           " para " + impuesto.getContribuyente().getNombre());
    }
    
}
