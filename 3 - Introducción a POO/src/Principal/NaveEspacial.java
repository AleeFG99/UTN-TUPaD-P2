/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author Ale
 */
public class NaveEspacial {
     // Atributos
    private String nombre;
    private int combustible;
    private int capacidadMaxima;

    // Constructor
    public NaveEspacial (String nombre, int combustibleInicial, int capacidadMaxima) {
        this.nombre = nombre;
        this.combustible = combustibleInicial;
        this.capacidadMaxima = capacidadMaxima;
    }

    // Método para despegar
    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10; // el despegue consume 10 unidades
            System.out.println("La nave " + nombre + " ha despegado. Combustible restante: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }

    // Método para avanzar cierta distancia
    public void avanzar(int distancia) {
        int consumo = distancia * 2; // ejemplo: 2 unidades de combustible por cada km
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println("La nave " + nombre + " avanzó " + distancia + " km. Combustible restante: " + combustible);
        } else {
            System.out.println("Combustible insuficiente para avanzar " + distancia + " km.");
        }
    }

    // Método para recargar combustible
    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad > capacidadMaxima) {
            combustible = capacidadMaxima;
            System.out.println("La nave se recargó hasta su capacidad máxima: " + capacidadMaxima);
        } else {
            combustible += cantidad;
            System.out.println("Se recargó " + cantidad + " unidades. Combustible actual: " + combustible);
        }
    }

    // Mostrar estado actual
    public void mostrarEstado() {
        System.out.println("\n=== Estado de la Nave ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible: " + combustible + "/" + capacidadMaxima);
        System.out.println("=========================");
    }
}

