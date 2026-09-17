package ventas.models.entities.productos;

public class ProductoDigital extends Producto {
    private double tamanioMb;

    public ProductoDigital(String nombreProducto, double precio, double tamanioMb) {
        super(nombreProducto, precio);
        this.tamanioMb = tamanioMb;
    }

    public double getTamanioMb() {
        return tamanioMb;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio() * 0.9;
    }

    @Override
    public String toString() {
        return "Producto digital: " + getNombreProducto() +
                " (ID " + getIdProducto() + ")" +
                ", precio $" + getPrecio() +
                ", tamaño " + tamanioMb + " MB" +
                ", precio final $" + calcularPrecioFinal();
    }
}
