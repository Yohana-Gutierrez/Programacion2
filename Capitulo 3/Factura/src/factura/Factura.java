/*
3.12 (La clase Factura) Cree una clase llamada Factura que una ferretería podría utilizar para representar una
factura para un artículo vendido en la tienda. Una Factura debe incluir cuatro piezas de información como variables
de instancia: un número de pieza (tipo String), la descripción de la pieza (tipo String), la cantidad de artículos de ese
tipo que se van a comprar (tipo int) y el precio por artículo (double). Su clase debe tener un constructor que inicialice las cuatro variables de instancia. Proporcione un método establecer y un método obtener para cada variable de
instancia. Además, proporcione un método llamado obtenerMontoFactura, que calcule el monto de la factura (es
decir, que multiplique la cantidad de artículos por el precio de cada uno) y después devuelva ese monto como un valor
double. Si la cantidad no es positiva, debe establecerse en 0. Si el precio por artículo no es positivo, debe establecerse
en 0.0. Escriba una aplicación de prueba llamada PruebaFactura, que demuestre las capacidades de la clase Factura.
 */
package factura;

public class Factura {
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precio;

    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precio) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        this.setCantidad(cantidad);
        this.setPrecio(precio);
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            this.precio = 0.0;
        }
    }

    public double obtenerMontoFactura() {
        return cantidad * precio;
    }
}
