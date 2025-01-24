package Ej2;

public class Ingrediente {
    private String nombre;
    private double cantidad;
    private String unidadDeMedida;

    // Constructor
    public Ingrediente(String nombre, double cantidad, String unidadDeMedida) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidadDeMedida = unidadDeMedida;
    }

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public String getUnidadDeMedida() {
        return unidadDeMedida;
    }

    // Método para mostrar el ingrediente
    public String mostrarIngrediente() {
        return nombre + " " + cantidad + " " + unidadDeMedida;
    }
}