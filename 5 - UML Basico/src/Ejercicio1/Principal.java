/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

import java.util.Date;

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
         Foto foto = new Foto("foto1.jpg", "jpg");
        Pasaporte pasaporte = new Pasaporte("A123456", new Date(), foto);
        Titular titular = new Titular("Juan Pérez", "12345678");

        // Asociación bidireccional
        pasaporte.setTitular(titular);

        // Mostrar datos
        System.out.println(pasaporte);
        System.out.println(pasaporte.getTitular());
        System.out.println(titular.getPasaporte());
    }
    
}
