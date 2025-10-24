/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte2;
import java.util.Scanner;
/**
 *
 * @author Ale
 */
public class ConversionNumero {
    public static int convertirAEntero(String texto) {
        try {
            return Integer.parseInt(texto);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Error: '" + texto + "' no es un número entero válido");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        String entrada = scanner.nextLine();
        
        try {
            int numero = convertirAEntero(entrada);
            System.out.println("Número convertido: " + numero);
            System.out.println("El doble del número es: " + (numero * 2));
            
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
