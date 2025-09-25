/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13;

/**
 *
 * @author Ale
 */
public class GeneradorQR {
    // Dependencia de creación: crea CodigoQR dentro del método
    public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario); // se crea aquí
        System.out.println("Código QR generado: " + qr);
    }
}
