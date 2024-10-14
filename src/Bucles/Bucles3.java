package Bucles;

import java.util.Scanner;
public class Bucles3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de productos: ");
        int Productos = scanner.nextInt();

        int i = 1;
        while (i <= Productos) {
            System.out.print("Ingrese la cantidad disponible del producto " + i + ": ");
            int Disponible = scanner.nextInt();
            if (Disponible < 5) {
                System.out.println("Es necesario realizar un pedido para el producto " + i + ".");
            }
            i++;
        }
    }
}
