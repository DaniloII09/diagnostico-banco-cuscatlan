package ventas.models.entities.productos;

public abstract class Producto {
    private int idProducto;
    private String nombreProducto;
    private double precio;
    private static int contadorProductos = 1;

    public Producto() {
        this.idProducto = contadorProductos++;
    }

    public Producto(String nombreProducto, double precio) {
        this.idProducto = contadorProductos++;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

    public static void setContadorProductos(int contadorProductos) {
        Producto.contadorProductos = contadorProductos;
    }

    public double calcularPrecioFinal() {
        return precio;
    }

    @Override
    public String toString() {
        return "";
    }
}
