/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte2;

/**
 *
 * @author Ale
 */
public class ValidadorEdad {
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0) {
            throw new EdadInvalidaException("Error: La edad no puede ser negativa");
        } else if (edad > 120) {
            throw new EdadInvalidaException("Error: La edad no puede ser mayor a 120 años");
        }
    }
    
    public static void main(String[] args) {
        int[] edades = {25, -5, 150, 30, 200};
        
        for (int edad : edades) {
            try {
                validarEdad(edad);
                System.out.println("Edad válida: " + edad + " años");
                
            } catch (EdadInvalidaException e) {
                System.out.println(e.getMessage() + " (edad ingresada: " + edad + ")");
            }
        }
    }
}
