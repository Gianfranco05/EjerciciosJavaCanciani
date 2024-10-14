package Bucles;

import java.util.Scanner;
public class Bucles2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double tarifa = 15.0;
        System.out.print("Ingrese la cantidad de empleados: ");
        int cantidadEmpleados = scanner.nextInt();
        for (int i = 1; i <= cantidadEmpleados; i++) {
            System.out.print("Ingrese las horas trabajadas para el empleado " + i + ": ");
            double horas = scanner.nextDouble();

            double salario = horas * tarifa;

            System.out.printf("El salario semanal del empleado %d es: $%.2f%n", i, salario);
        }


    }
}
