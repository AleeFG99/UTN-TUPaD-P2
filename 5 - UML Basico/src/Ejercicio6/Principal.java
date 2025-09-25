/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio6;

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
         Cliente cliente = new Cliente("María Pérez", "381-445566");
        Mesa mesa = new Mesa(5, 4);
        Reserva reserva = new Reserva("2025-09-30", "21:00", cliente, mesa);

        // Mostrar datos
        System.out.println(reserva);
        System.out.println("Cliente de la reserva: " + reserva.getCliente());
        System.out.println("Mesa reservada: " + reserva.getMesa());
    }
    
}
