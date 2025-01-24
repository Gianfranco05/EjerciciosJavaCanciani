package Ej3;

public class DetalleFactura {
    private String codigoArticulo;
    private String nombreArticulo;
    private int cantidad;
    private double precioUnitario;
    private double descuentoItem;
    private double subtotal;

    // Constructor
    public DetalleFactura(String codigoArticulo, String nombreArticulo, int cantidad, double precioUnitario, double descuentoItem) {
        this.codigoArticulo = codigoArticulo;
        this.nombreArticulo = nombreArticulo;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.descuentoItem = descuentoItem;
        this.subtotal = calcularSubtotal();
    }

    // Métodos getter y setter
    public String getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(String codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getDescuentoItem() {
        return descuentoItem;
    }

    public void setDescuentoItem(double descuentoItem) {
        this.descuentoItem = descuentoItem;
    }

    public double getSubtotal() {
        return subtotal;
    }

    // Método para calcular el subtotal
    private double calcularSubtotal() {
        return (precioUnitario * cantidad) - (descuentoItem * cantidad);
    }

    // Método para mostrar el detalle del artículo
    public void mostrarDetalle() {
        System.out.printf("%-10s %-20s %-10d %-15.2f %-15.2f %-10.2f\n", codigoArticulo, nombreArticulo, cantidad, precioUnitario, descuentoItem, subtotal);
    }
}