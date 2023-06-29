/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factura;
public class PruebaFactura {
    public static void main(String[] args) {
        // Crear una instancia de Factura
        Factura factura = new Factura("123", "Martillo", 2, 9.99);

        // Mostrar la información de la factura
        System.out.println("Número de pieza: " + factura.getNumeroPieza());
        System.out.println("Descripción de la pieza: " + factura.getDescripcionPieza());
        System.out.println("Cantidad: " + factura.getCantidad());
        System.out.println("Precio por artículo: " + factura.getPrecio());

        // Calcular y mostrar el monto de la factura
        System.out.println("Monto de la factura: " + factura.obtenerMontoFactura());
    }
}
