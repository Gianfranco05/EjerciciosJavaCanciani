package Ej3;

import java.util.ArrayList;

public class Factura {
    private String fechaFactura;
    private long numeroFactura;
    private double totalCalculadoFactura;
    private String cliente;
    private ArrayList<DetalleFactura> detallesFactura;

    // Constructor
    public Factura() {
        detallesFactura = new ArrayList<>();
    }

    // Métodos getter y setter
    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public long getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(long numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public double getTotalCalculadoFactura() {
        return totalCalculadoFactura;
    }

    public void setTotalCalculadoFactura(double totalCalculadoFactura) {
        this.totalCalculadoFactura = totalCalculadoFactura;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public ArrayList<DetalleFactura> getDetallesFactura() {
        return detallesFactura;
    }

    // Método para agregar un detalle a la factura
    public void agregarDetalle(DetalleFactura detalle) {
        detallesFactura.add(detalle);
    }

    // Método para calcular el total de la factura
    public void calcularMontoTotal() {
        double total = 0.0;
        for (DetalleFactura detalle : detallesFactura) {
            total += detalle.getSubtotal();
        }
        this.totalCalculadoFactura = total;
    }

    // Método para mostrar la factura
    public void mostrarFactura() {
        System.out.println("Fecha: " + fechaFactura);
        System.out.println("Número: " + numeroFactura);
        System.out.println("Cliente: " + cliente);
        System.out.println("\nCódigo Articulo Nombre Articulo Cantidad Precio Unitario Descuento Subtotal");
        for (DetalleFactura detalle : detallesFactura) {
            detalle.mostrarDetalle();
        }
        System.out.println("\nTotal: " + totalCalculadoFactura);
    }
}