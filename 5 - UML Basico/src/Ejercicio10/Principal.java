/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio10;

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
        ClaveSeguridad clave = new ClaveSeguridad("XYZ123", "2025-09-25");
        Titular titular = new Titular("Lucía Fernández", "30111222");
        CuentaBancaria cuenta = new CuentaBancaria("1234567890123456789012", 15000.50, clave, titular);

        System.out.println(cuenta);
        System.out.println("Titular accede a su cuenta: " + titular.getCuenta().getCbu());
        System.out.println("Clave de la cuenta: " + cuenta.getClave().getCodigo());
    }
    
}
