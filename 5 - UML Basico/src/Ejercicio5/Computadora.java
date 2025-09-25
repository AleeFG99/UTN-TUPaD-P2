/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author Ale
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;     // Composición
    private Propietario propietario;   // Asociación bidireccional

    public Computadora(String marca, String numeroSerie, PlacaMadre placaMadre) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = placaMadre;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        propietario.setComputadora(this); // asegura la bidireccionalidad
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    @Override
    public String toString() {
        return "Computadora[marca=" + marca + 
               ", numeroSerie=" + numeroSerie + 
               ", placaMadre=" + placaMadre + "]";
    }
    
}
