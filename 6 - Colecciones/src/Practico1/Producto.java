/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico1;

/**
 *
 * @author Ale
 */
public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;
    
    // Constructor
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    
    // Constructor sobrecargado
    public Producto(String id, String nombre, double precio) {
        this(id, nombre, precio, 0, CategoriaProducto.ALIMENTOS);
    }
    
    // Métodos getters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getCantidad() { return cantidad; }
    public CategoriaProducto getCategoria() { return categoria; }
    
    // Setters
    public void setPrecio(double precio) { this.precio = precio; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    public void setCategoria(CategoriaProducto categoria) { this.categoria = categoria; }
    
    // Mostrar información
    public void mostrarInfo() {
        System.out.println("ID: " + id + ", Nombre: " + nombre + 
                          ", Precio: $" + precio + ", Stock: " + cantidad + 
                          ", Categoría: " + categoria + " (" + categoria.getDescripcion() + ")");
    }
    
    @Override
    public String toString() {
        return "Producto{id='" + id + "', nombre='" + nombre + "', precio=" + precio + 
               ", cantidad=" + cantidad + ", categoria=" + categoria + "}";
    }
    
}
