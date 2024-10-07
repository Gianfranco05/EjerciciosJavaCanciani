import java.util.Scanner;

public class Condicional2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Categoría del cliente (estudiante/adulto/jubilado): ");
        String categoria = scanner.next().toLowerCase();

        double descuento;

        switch (categoria) {
            case "estudiante":
                descuento = 0.10; // 10%
                break;
            case "adulto":
                descuento = 0.05; // 5%
                break;
            case "jubilado":
                descuento = 0.15; // 15%
                break;
            default:
                System.out.println("Categoría no válida.");
                scanner.close();
                return; // Salir del programa
        }

        double precioFinal = precio * (1 - descuento);
        System.out.printf("Precio final después del descuento: %.2f\n", precioFinal);


    }
}
