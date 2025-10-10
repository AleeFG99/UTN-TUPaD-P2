/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practico1;

/**
 *
 * @author Ale
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("=== SISTEMA DE GESTIÓN DE STOCK ===\n");
        
        // 1. Crear inventario
        Inventario inventario = new Inventario();
        
        // 2. Crear al menos cinco productos
        Producto p1 = new Producto("P001", "Arroz", 1500, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Smartphone", 250000, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Camiseta", 3500, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Sartén", 12000, 15, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Leche", 1800, 40, CategoriaProducto.ALIMENTOS);
        Producto p6 = new Producto("P006", "Laptop", 1500000, 5, CategoriaProducto.ELECTRONICA);
        
        // Agregar productos al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        inventario.agregarProducto(p6);
        
        // 3. Listar todos los productos
        inventario.listarProductos();
        
        // 4. Buscar producto por ID
        System.out.println("\n=== BUSCAR PRODUCTO POR ID ===");
        Producto productoBuscado = inventario.buscarProductoPorId("P003");
        if (productoBuscado != null) {
            productoBuscado.mostrarInfo();
        }
        
        // 5. Filtrar por categoría específica
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        
        // 6. Eliminar producto por ID y listar restantes
        System.out.println("\n=== ELIMINAR PRODUCTO ===");
        inventario.eliminarProducto("P005");
        inventario.listarProductos();
        
        // 7. Actualizar stock
        System.out.println("\n=== ACTUALIZAR STOCK ===");
        inventario.actualizarStock("P001", 75);
        
        // 8. Mostrar total de stock
        System.out.println("\nTotal de stock disponible: " + inventario.obtenerTotalStock() + " unidades");
        
        // 9. Obtener producto con mayor stock
        System.out.println("\n=== PRODUCTO CON MAYOR STOCK ===");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            mayorStock.mostrarInfo();
        }
        
        // 10. Filtrar productos por precio
        inventario.filtrarProductosPorPrecio(1000, 3000);
        
        // 11. Mostrar categorías disponibles
        inventario.mostrarCategoriasDisponibles();
    }
    
}
