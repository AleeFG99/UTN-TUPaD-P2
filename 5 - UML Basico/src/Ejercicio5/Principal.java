/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio5;

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
         PlacaMadre placa = new PlacaMadre("ASUS Prime B550", "AMD B550");
        Computadora compu = new Computadora("Dell", "SN123456", placa);
        Propietario propietario = new Propietario("Carlos López", "44556677");

        // Asociación bidireccional
        compu.setPropietario(propietario);

        // Mostrar datos
        System.out.println(compu);
        System.out.println("Propietario: " + compu.getPropietario());
        System.out.println("Computadora del propietario: " + propietario.getComputadora());
    }
    
}
