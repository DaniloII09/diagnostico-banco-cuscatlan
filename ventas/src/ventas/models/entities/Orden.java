package ventas.models.entities;

import ventas.models.entities.productos.Producto;

import java.time.LocalDate;

public class Orden {
    private int idOrden;
    private Producto[] productos;
    private Cliente cliente;
    private LocalDate fecha;
    private int cantidadProductos = 0;
    private static int contadorOrdenes = 1;
    private static final int MAX_PRODUCTOS = 10;

    public Orden() {
        this.idOrden = contadorOrdenes++;
        this.productos = new Producto[MAX_PRODUCTOS];
        this.fecha = LocalDate.now();
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean agregarProducto(Producto producto) {
        if(cantidadProductos < MAX_PRODUCTOS) {
            productos[cantidadProductos] = producto;
            cantidadProductos++;
            return true;
        }
        return false;
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < cantidadProductos; i++) {
            total += productos[i].calcularPrecioFinal();
        }

        if(cliente != null) {
            switch (cliente.getTipoPago()) {
                case CONTADO:
                    return total*0.95;
                case CREDITO:
                    return total*1.10;
            }
        }

        return total;
    }

    public void mostrarOrden() {
        System.out.println("Orden: " + idOrden);
        System.out.println("Fecha: " + fecha);

        if (cliente != null) {
            System.out.println(cliente);
        } else {
            System.out.println("Cliente: (sin asignar)");
        }

        System.out.println("Productos:");
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.println((i + 1) + ". " + productos[i]);
        }

        System.out.println("Total a pagar: $" + calcularTotal());
    }
}
