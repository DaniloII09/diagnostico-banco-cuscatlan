import ventas.models.entities.Cliente;
import ventas.models.entities.Orden;
import ventas.models.entities.productos.ProductoDigital;
import ventas.models.entities.productos.ProductoFisico;

import static ventas.models.enums.TipoPago.CONTADO;
import static ventas.models.enums.TipoPago.CREDITO;

public class Ventas {
    static void main(String[] args) {
        //crear clientes
        Cliente clienteContado = new Cliente("Pepito", CONTADO);
        Cliente clienteCredito = new Cliente("Jaimito", CREDITO);

        //crear productos
        ProductoFisico productoFisico1 = new ProductoFisico("Laptop", 300, 10);
        ProductoFisico productoFisico2 = new ProductoFisico("Calculadora", 20, 10);
        ProductoDigital productoDigital = new ProductoDigital("GTA VI", 100, 3000);

        //crear orden y agregar productos
        Orden orden = new Orden();
        System.out.println("Producto físico 1 " + (orden.agregarProducto(productoFisico1) ? "agreado" : "orden llena"));
        System.out.println("Producto físico 2 " + (orden.agregarProducto(productoFisico2) ? "agreado" : "orden llena"));
        System.out.println("Producto digital " + (orden.agregarProducto(productoDigital) ? "agreado" : "orden llena"));

        //asignar orden a cliente contado y mostrar orden
        System.out.println("---------------------------");
        System.out.println("Orden con cliente contado");
        orden.setCliente(clienteContado);
        orden.mostrarOrden();
        System.out.println("---------------------------");

        //asignar orden a cliente credito y mostrar orden
        System.out.println("Orden con cliente credito");
        orden.setCliente(clienteCredito);
        orden.mostrarOrden();
        System.out.println("---------------------------");


        //prueba de llenado de productos (11 productos)
        System.out.println("Orden con llenado de lista de productos");
        Orden pruebaOrdenLlena = new Orden();
        for (int i = 0; i < 11; i++) {
            ProductoDigital p = new ProductoDigital("Producto", 10, 100);
            boolean estaAgregado = pruebaOrdenLlena.agregarProducto(p);
            System.out.println("Producto " + (i+1) + (estaAgregado ? " agreado" : " orden llena, no agregado"));
        }
    }

}
