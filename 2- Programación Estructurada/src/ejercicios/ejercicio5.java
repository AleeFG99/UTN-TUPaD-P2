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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear un objeto Scanner para leer datos desde el teclado
        Scanner scanner = new Scanner(System.in);

        int numero;       // Variable para almacenar el número ingresado por el usuario
        int sumaPares = 0; // Acumulador para la suma de los números pares

        // Pedimos el primer número al usuario
        System.out.print("Ingrese un número (0 para terminar): ");
        numero = scanner.nextInt();

        // Mientras el número ingresado no sea 0, seguimos pidiendo más números
        while (numero != 0) {
            // Verificamos si el número es par
            if (numero % 2 == 0) {
                // Si es par, lo sumamos al acumulador
                sumaPares += numero;
            }

            // Volvemos a pedir otro número
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();
        }

        // Cuando se ingresa 0, salimos del bucle y mostramos la suma total de pares
        System.out.println("La suma de los números pares es: " + sumaPares);
    }
    
}

