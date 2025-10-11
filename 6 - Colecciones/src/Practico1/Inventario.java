/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico1;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ale
 */
public class Inventario {
    private ArrayList<Producto> productos;
    
    public Inventario() {
        this.productos = new ArrayList<>();
    }
    
    // Agregar producto
    public void agregarProducto(Producto p) {
        productos.add(p);
        System.out.println("Producto agregado: " + p.getNombre());
    }
    
    // Listar todos los productos
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }
        System.out.println("\n=== LISTA DE PRODUCTOS ===");
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }
    
    // Buscar producto por ID
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }
    
    // Eliminar producto por ID
    public boolean eliminarProducto(String id) {
        Producto producto = buscarProductoPorId(id);
        if (producto != null) {
            productos.remove(producto);
            System.out.println("Producto eliminado: " + producto.getNombre());
            return true;
        }
        System.out.println("Producto con ID " + id + " no encontrado.");
        return false;
    }
    
    // Actualizar stock
    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto producto = buscarProductoPorId(id);
        if (producto != null) {
            producto.setCantidad(nuevaCantidad);
            System.out.println("Stock actualizado para " + producto.getNombre() + ": " + nuevaCantidad);
            return true;
        }
        return false;
    }
    
    // Filtrar por categoría
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("\n=== PRODUCTOS EN CATEGORÍA: " + categoria + " ===");
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay productos en la categoría " + categoria);
        }
    }
    
    // Obtener total de stock
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }
    
    // Obtener producto con mayor stock
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) return null;
        
        Producto mayorStock = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > mayorStock.getCantidad()) {
                mayorStock = p;
            }
        }
        return mayorStock;
    }
    
    // Filtrar productos por precio
    public void filtrarProductosPorPrecio(double min, double max) {
        System.out.println("\n=== PRODUCTOS ENTRE $" + min + " Y $" + max + " ===");
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay productos en ese rango de precios.");
        }
    }
    
    // Mostrar categorías disponibles
    public void mostrarCategoriasDisponibles() {
        System.out.println("\n=== CATEGORÍAS DISPONIBLES ===");
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println("- " + categoria + ": " + categoria.getDescripcion());
        }
    }
    
}
