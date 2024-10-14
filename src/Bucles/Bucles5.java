package Bucles;

import java.util.Scanner;
public class Bucles5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de empleados: ");
        int numeroEmpleados = scanner.nextInt();

        int i = 1;
        while (i <= numeroEmpleados) {
            System.out.print("Ingrese las horas trabajadas por el empleado " + i + ": ");
            int horasTrabajadas = scanner.nextInt();

            if (horasTrabajadas > 40) {
                int horasExtras = horasTrabajadas - 40;
                System.out.println("El empleado " + i + " trabajó " + horasExtras + " horas extras.");
            } else {
                System.out.println("El empleado " + i + " no trabajó horas extras.");
            }

            i++;
        }

    }
}
