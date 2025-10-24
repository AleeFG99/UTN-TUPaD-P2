/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Ale
 */
public class TryWithResourcesExample {
     public static void leerArchivoConRecursos(String nombreArchivo) {
        // try-with-resources cierra automáticamente los recursos
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            
            System.out.println("Leyendo archivo: " + nombreArchivo);
            System.out.println("-----------------------------");
            
            String linea;
            int numeroLinea = 1;
            
            while ((linea = br.readLine()) != null) {
                System.out.printf("%d: %s%n", numeroLinea, linea);
                numeroLinea++;
            }
            
            System.out.println("-----------------------------");
            System.out.println("Archivo leído exitosamente");
            
        } catch (IOException e) {
            System.out.println("Error de E/S: " + e.getMessage());
        }
        // No es necesario el bloque finally para cerrar el BufferedReader
    }
    
    public static void main(String[] args) {
        leerArchivoConRecursos("ejemplo.txt");
    }
}
