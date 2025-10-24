/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1;

/**
 *
 * @author Ale
 */
public class TarjetaCredito implements PagoConDescuento {
     private String numeroTarjeta;
    private String titular;
    private double limiteDescuento;
    
    public TarjetaCredito(String numeroTarjeta, String titular, double limiteDescuento) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
        this.limiteDescuento = limiteDescuento;
    }
    
    @Override
    public boolean procesarPago(double monto) {
        System.out.printf("Procesando pago con tarjeta de $%.2f%n", monto);
        return true;
    }
    
    @Override
    public double aplicarDescuento(double monto) {
        double descuento = Math.min(monto * 0.10, limiteDescuento);
        System.out.printf("Descuento aplicado: $%.2f%n", descuento);
        return monto - descuento;
    }
    
    // Getters
    public String getNumeroTarjeta() { return numeroTarjeta; }
    public String getTitular() { return titular; }
    public double getLimiteDescuento() { return limiteDescuento; }
}
