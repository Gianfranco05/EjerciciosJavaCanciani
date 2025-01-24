package Ej2;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuRestaurant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Plato> platosMenu = new ArrayList<>();

        System.out.print("Ingrese el número de platos en el menú: ");
        int cantidadPlatos = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer

        // Cargar platos
        for (int i = 0; i < cantidadPlatos; i++) {
            System.out.println("Ingreso de datos para el plato " + (i + 1));

            // Ingreso de datos del plato
            System.out.print("Nombre del plato: ");
            String nombreCompleto = scanner.nextLine();

            System.out.print("Precio del plato: $ ");
            double precio = scanner.nextDouble();

            System.out.print("¿Es una bebida? (true/false): ");
            boolean esBebida = scanner.nextBoolean();
            scanner.nextLine();  // Limpiar el buffer

            // Crear objeto Plato
            Plato plato = new Plato(nombreCompleto, precio, esBebida);

            // Si no es bebida, agregar ingredientes
            if (!esBebida) {
                System.out.print("¿Cuántos ingredientes tiene el plato? ");
                int cantidadIngredientes = scanner.nextInt();
                scanner.nextLine();  // Limpiar el buffer

                while (cantidadIngredientes <= 0) {
                    System.out.println("Debe ingresar al menos un ingrediente.");
                    System.out.print("¿Cuántos ingredientes tiene el plato? ");
                    cantidadIngredientes = scanner.nextInt();
                    scanner.nextLine();  // Limpiar el buffer
                }

                // Cargar ingredientes
                for (int j = 0; j < cantidadIngredientes; j++) {
                    System.out.print("Ingrese el nombre del ingrediente " + (j + 1) + ": ");
                    String nombreIngrediente = scanner.nextLine();

                    System.out.print("Ingrese la cantidad del ingrediente " + (j + 1) + ": ");
                    double cantidad = scanner.nextDouble();

                    scanner.nextLine();  // Limpiar el buffer

                    System.out.print("Ingrese la unidad de medida del ingrediente " + (j + 1) + ": ");
                    String unidadDeMedida = scanner.nextLine();

                    // Crear objeto Ingrediente y agregar al plato
                    Ingrediente ingrediente = new Ingrediente(nombreIngrediente, cantidad, unidadDeMedida);
                    plato.agregarIngrediente(ingrediente);
                }
            }

            // Agregar el plato al menú
            platosMenu.add(plato);
        }

        // Mostrar el menú
        System.out.println("\nMENÚ DEL RESTAURANTE");
        for (Plato plato : platosMenu) {
            plato.mostrarPlato();
        }

        scanner.close();
    }
}