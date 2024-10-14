package Bucles;

import java.util.Scanner;
public class Bucles4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalVentas = 0;
        int dia = 1;

        do {
            System.out.print("Ingrese las ventas del día " + dia + ": ");
            double ventasDiarias = scanner.nextDouble();
            totalVentas += ventasDiarias;
            dia++;
        } while (dia <= 7);

        System.out.println("El total de ventas de la semana es: $" + totalVentas);

    }
}
