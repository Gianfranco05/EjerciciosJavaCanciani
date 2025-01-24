package Ej2;

import java.util.ArrayList;

public class Plato {
    private String nombreCompleto;
    private double precio;
    private boolean esBebida;
    private ArrayList<Ingrediente> ingredientes;

    // Constructor
    public Plato(String nombreCompleto, double precio, boolean esBebida) {
        this.nombreCompleto = nombreCompleto;
        this.precio = precio;
        this.esBebida = esBebida;
        this.ingredientes = new ArrayList<>();
    }

    // Métodos getter
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean esBebida() {
        return esBebida;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    // Método para agregar un ingrediente al plato
    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    // Método para mostrar la información del plato
    public void mostrarPlato() {
        System.out.println("Nombre: " + nombreCompleto);
        System.out.println("Precio: $ " + precio);
        if (!esBebida) {
            System.out.println("Ingredientes:");
            System.out.println("Nombre Cantidad Unidad de Medida");
            for (Ingrediente ingrediente : ingredientes) {
                System.out.println(ingrediente.mostrarIngrediente());
            }
        } else {
            System.out.println("Es una bebida");
        }
        System.out.println();
    }
}