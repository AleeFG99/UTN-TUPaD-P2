/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

/**
 *
 * @author Ale
 */
public class Empleado {
      // Atributos con encapsulamiento
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    
    // Constructor que recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    
    // Constructor sobrecargado - solo nombre y puesto
    public Empleado(String nombre, String puesto) {
        this.id = totalEmpleados + 1; // ID automático
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1000.0; // Salario por defecto
        totalEmpleados++;
    }
    
    // Métodos sobrecargados actualizarSalario
    public void actualizarSalario(double porcentajeAumento) {
        this.salario += this.salario * (porcentajeAumento / 100);
    }
    
    public void actualizarSalario(int aumentoFijo) {
        this.salario += aumentoFijo;
    }
    
    // Método toString
    @Override
    public String toString() {
        return "Empleado [ID: " + id + 
               ", Nombre: " + nombre + 
               ", Puesto: " + puesto + 
               ", Salario: $" + String.format("%.2f", salario) + "]";
    }
    
    // Método estático
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
    // Getters y Setters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getPuesto() {
        return puesto;
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}

