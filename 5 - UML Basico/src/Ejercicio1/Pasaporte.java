/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.util.Date;

/**
 *
 * @author Ale
 */
public class Pasaporte {
    private String numero;
    private Date fechaEmision;
    private Foto foto;          // Composición
    private Titular titular;    // Asociación bidireccional

    public Pasaporte(String numero, Date fechaEmision, Foto foto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        titular.setPasaporte(this);  // asegura la bidireccionalidad
    }

    public Titular getTitular() {
        return titular;
    }

    public Foto getFoto() {
        return foto;
    }

    @Override
    public String toString() {
        return "Pasaporte[numero=" + numero + 
               ", fechaEmision=" + fechaEmision + 
               ", foto=" + foto + "]";
    }
    
}
