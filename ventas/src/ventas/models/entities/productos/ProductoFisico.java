package ventas.models.entities.productos;

public class ProductoFisico extends Producto {
    private double costoEnvio;

    public ProductoFisico(String nombreProducto, double precio, double costoEnvio) {
        super(nombreProducto, precio);
        this.costoEnvio = costoEnvio;
    }

    public double getCostoEnvio() {
        return costoEnvio;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio() + costoEnvio;
    }

    @Override
    public String toString() {
        return "Producto físico: " + getNombreProducto() +
                " (ID " + getIdProducto() + ")" +
                ", precio $" + getPrecio() +
                ", costo de envío $" + costoEnvio +
                ", precio final $" + calcularPrecioFinal();
    }
}
