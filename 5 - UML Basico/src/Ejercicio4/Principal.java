/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio4;


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
        Banco banco = new Banco("Banco Nación", "30-12345678-9");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9876-5432", new Date(), banco);
        Cliente cliente = new Cliente("Laura Martínez", "44112233");

        // Asociación bidireccional
        tarjeta.setCliente(cliente);

        // Mostrar datos
        System.out.println(tarjeta);
        System.out.println(tarjeta.getCliente());
        System.out.println(cliente.getTarjeta());
    }
    
}
