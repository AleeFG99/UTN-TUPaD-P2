/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1;

/**
 *
 * @author Ale
 */
public class PayPal implements Pago {
     private String email;
    
    public PayPal(String email) {
        this.email = email;
    }
    
    @Override
    public boolean procesarPago(double monto) {
        System.out.printf("Procesando pago con PayPal de $%.2f%n", monto);
        return true;
    }
    
    // Getter
    public String getEmail() { return email; }
}
