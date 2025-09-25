/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio13;

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
     
        Usuario usuario = new Usuario("Carlos Gómez", "carlos@example.com");
        GeneradorQR generador = new GeneradorQR();

        generador.generar("QR-123456789", usuario); // Dependencia de creación
    }
    
}
