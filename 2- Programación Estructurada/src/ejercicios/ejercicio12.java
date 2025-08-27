/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Ale
 */
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);

        // Declarar e inicializar el array de precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // Mostrar precios originales
        System.out.println("Precios originales:");
        for (int i = 0; i < precios.length; i++) {
            System.out.println((i + 1) + ". Precio: $" + precios[i]);
        }

        // Pedir al usuario qué producto desea modificar
        System.out.print("\nIngrese el número del producto que desea modificar (1-" + precios.length + "): ");
        int indice = scanner.nextInt();

        // Validar que el índice esté dentro del rango
        if (indice < 1 || indice > precios.length) {
            System.out.println("Número de producto inválido.");
        } else {
            // Pedir el nuevo precio
            System.out.print("Ingrese el nuevo precio del producto: $");
            double nuevoPrecio = scanner.nextDouble();

            // Actualizar el precio en el array
            precios[indice - 1] = nuevoPrecio;

            // Mostrar precios modificados
            System.out.println("\nPrecios modificados:");
            for (int i = 0; i < precios.length; i++) {
                System.out.println((i + 1) + ". Precio: $" + precios[i]);
            }
        }
    }
    
}


