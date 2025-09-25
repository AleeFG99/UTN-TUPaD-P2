/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author Ale
 */
public class CuentaBancaria {
     private String cbu;
    private double saldo;
    private ClaveSeguridad clave; // Composición
    private Titular titular;      // Asociación bidireccional

    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad clave, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = clave;
        this.titular = titular;
        titular.setCuenta(this); // vínculo bidireccional
    }

    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public ClaveSeguridad getClave() {
        return clave;
    }

    public Titular getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "CuentaBancaria[cbu=" + cbu + ", saldo=" + saldo + 
               ", titular=" + titular + ", clave=" + clave + "]";
    }
    
}
