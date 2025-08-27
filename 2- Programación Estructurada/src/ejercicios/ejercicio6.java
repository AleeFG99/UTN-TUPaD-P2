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
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);

        int positivos = 0; // Contador de números positivos
        int negativos = 0; // Contador de números negativos
        int ceros = 0;     // Contador de ceros

        // Usamos un ciclo for para pedir 10 números
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scanner.nextInt();

            // Verificamos el valor del número y actualizamos los contadores
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        // Mostramos los resultados
        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
    
}

