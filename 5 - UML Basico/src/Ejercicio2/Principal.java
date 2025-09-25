/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

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
         Bateria bateria = new Bateria("Samsung-BX100", 5000);
        Celular celular = new Celular("356789123456789", "Samsung", "Galaxy S22", bateria);
        Usuario usuario = new Usuario("Ana Gómez", "44556677");

        // Asociación bidireccional
        celular.setUsuario(usuario);

        // Mostrar datos
        System.out.println(celular);
        System.out.println(celular.getUsuario());
        System.out.println(usuario.getCelular());
    }
    
}
