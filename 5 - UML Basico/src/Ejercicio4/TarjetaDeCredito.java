/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

import java.util.Date;


/**
 *
 * @author Ale
 */
public class TarjetaDeCredito {
     private String numero;
    private Date fechaVencimiento;
    private Cliente cliente;  // Asociación bidireccional
    private Banco banco;      // Agregación

    public TarjetaDeCredito(String numero, Date fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        cliente.setTarjeta(this); // asegura bidireccionalidad
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito[numero=" + numero + 
               ", fechaVencimiento=" + fechaVencimiento + 
               ", banco=" + banco + "]";
    }
    
}
