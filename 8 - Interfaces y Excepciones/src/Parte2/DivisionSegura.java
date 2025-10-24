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
public class DivisionSegura {
    public static double dividir(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Error: No se puede dividir por cero");
        }
        return dividendo / divisor;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese el dividendo: ");
            double dividendo = scanner.nextDouble();
            
            System.out.print("Ingrese el divisor: ");
            double divisor = scanner.nextDouble();
            
            double resultado = dividir(dividendo, divisor);
            System.out.printf("Resultado: %.2f / %.2f = %.2f%n", dividendo, divisor, resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("Error aritmético: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Entrada inválida");
        } finally {
            scanner.close();
            System.out.println("Operación de división finalizada");
        }
    }
}
