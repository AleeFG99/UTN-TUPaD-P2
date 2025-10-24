/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Parte1;


/**
 *
 * @author Ale
 */
public class Principal {
  public static void main(String[] args) {
        // Crear cliente
        Cliente cliente = new Cliente("Juan Pérez", "juan@email.com");
        
        // Crear productos
        Producto producto1 = new Producto("Laptop", 1500.00);
        Producto producto2 = new Producto("Mouse", 25.50);
        Producto producto3 = new Producto("Teclado", 75.00);
        
        // Crear pedido
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(producto1);
        pedido.agregarProducto(producto2);
        pedido.agregarProducto(producto3);
        
        System.out.println("=== SISTEMA DE E-COMMERCE ===");
        System.out.println(cliente);
        System.out.println(pedido);
        
        // Mostrar productos
        System.out.println("\nProductos en el pedido:");
        for (Producto producto : pedido.getProductos()) {
            System.out.println("  - " + producto);
        }
        
        // Procesar pagos
        System.out.println("\n=== PROCESAMIENTO DE PAGOS ===");
        
        // Pago con tarjeta de crédito (con descuento)
        TarjetaCredito tarjeta = new TarjetaCredito("1234-5678-9012-3456", "Juan Pérez", 100.00);
        double totalConDescuento = tarjeta.aplicarDescuento(pedido.calcularTotal());
        tarjeta.procesarPago(totalConDescuento);
        
        // Pago con PayPal (sin descuento)
        PayPal paypal = new PayPal("juan@email.com");
        paypal.procesarPago(pedido.calcularTotal());
        
        // Cambiar estado del pedido (notificación automática)
        System.out.println("\n=== NOTIFICACIONES ===");
        pedido.cambiarEstado("PROCESANDO");
        pedido.cambiarEstado("ENVIADO");
        pedido.cambiarEstado("ENTREGADO");
    }
    
}
