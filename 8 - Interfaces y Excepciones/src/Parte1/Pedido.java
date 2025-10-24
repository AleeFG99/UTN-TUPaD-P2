/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ale
 */
public class Pedido implements Pagable {
   private List<Producto> productos;
    private String estado;
    private Cliente cliente;
    
    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.estado = "PENDIENTE";
        this.cliente = cliente;
    }
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        if (cliente != null) {
            cliente.notificar("El pedido cambió al estado: " + nuevoEstado);
        }
    }
    
    @Override
    public double calcularTotal() {
        return productos.stream()
                .mapToDouble(Producto::calcularTotal)
                .sum();
    }
    
    // Getters
    public List<Producto> getProductos() { return productos; }
    public String getEstado() { return estado; }
    public Cliente getCliente() { return cliente; }
    
    @Override
    public String toString() {
        return String.format("Pedido - Estado: %s, Total: $%.2f, Productos: %d", 
                           estado, calcularTotal(), productos.size());
    }

}
