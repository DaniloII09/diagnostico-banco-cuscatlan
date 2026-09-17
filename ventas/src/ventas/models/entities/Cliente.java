package ventas.models.entities;

import ventas.models.enums.TipoPago;

public class Cliente {
    private int idCliente;
    private String nombreCliente;
    private TipoPago tipoPago;
    private static int contadorClientes = 1;

    public Cliente(String nombreCliente, TipoPago tipoPago) {
        this.idCliente = contadorClientes++;
        this.nombreCliente = nombreCliente;
        this.tipoPago = tipoPago;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public TipoPago getTipoPago() {
        return tipoPago;
    }

    public static int getContadorClientes() {
        return contadorClientes;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombreCliente +
                " (ID " + idCliente + ")" +
                ", tipo de pago " + tipoPago;
    }
}
