/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio12;

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
          Contribuyente contribuyente = new Contribuyente("Juan Perez", "20-12345678-9");
        Impuesto impuesto = new Impuesto(15000.75, contribuyente);

        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto); // Dependencia de uso
    }
    
}
