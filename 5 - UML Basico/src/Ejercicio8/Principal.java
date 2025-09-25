/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio8;

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

        Usuario usuario = new Usuario("Ana López", "ana@example.com");
        FirmaDigital firma = new FirmaDigital("ABC123HASH", "2025-09-25", usuario);
        Documento doc = new Documento("Contrato", "Contenido del contrato...", firma);

        // Mostrar datos
        System.out.println(doc);
        System.out.println("Firma digital: " + doc.getFirmaDigital());
        System.out.println("Usuario de la firma: " + doc.getFirmaDigital().getUsuario());
    
    }
    
}
