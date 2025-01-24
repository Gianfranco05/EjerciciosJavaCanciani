package Ej1;

import java.util.ArrayList;
import java.util.Scanner;

public class CargaNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<>();

        System.out.print("Ingrese el número de alumnos: ");
        int cantidadAlumnos = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer

        // Ingresar los datos de los alumnos
        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Ingreso de datos para el Ej1.Alumno " + (i + 1));

            // Ingreso de datos del alumno
            System.out.print("Nombre completo del alumno: ");
            String nombreCompleto = scanner.nextLine();

            System.out.print("Legajo del alumno: ");
            long legajo = scanner.nextLong();
            scanner.nextLine();  // Limpiar el buffer

            Alumno alumno = new Alumno(nombreCompleto, legajo);

            // Ingreso de las notas del alumno
            System.out.print("Ingrese el número de notas del alumno: ");
            int cantidadNotas = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            while (cantidadNotas <= 0) {
                System.out.println("Debe ingresar al menos una nota.");
                System.out.print("Ingrese el número de notas del alumno: ");
                cantidadNotas = scanner.nextInt();
                scanner.nextLine();  // Limpiar el buffer
            }

            for (int j = 0; j < cantidadNotas; j++) {
                System.out.print("Ingrese la cátedra para la nota " + (j + 1) + ": ");
                String catedra = scanner.nextLine();

                System.out.print("Ingrese la nota para la cátedra " + catedra + ": ");
                double notaExamen = scanner.nextDouble();
                scanner.nextLine();  // Limpiar el buffer

                Nota nota = new Nota(catedra, notaExamen);
                alumno.agregarNota(nota);
            }

            // Agregar el alumno a la lista
            alumnos.add(alumno);
        }

        // Mostrar los resultados
        System.out.println("\nInformación de los alumnos y sus promedios:");
        for (Alumno alumno : alumnos) {
            System.out.println("Nombre: " + alumno.getNombreCompleto() + " - Legajo: " + alumno.getLegajo());
            System.out.println("Notas:");
            for (Nota nota : alumno.getNotas()) {
                System.out.println("Cátedra: " + nota.getCatedra() + " - Ej1.Nota: " + nota.getNotaExamen());
            }
            System.out.println("Promedio: " + alumno.calcularPromedio());
            System.out.println();
        }

        scanner.close();
    }
}
