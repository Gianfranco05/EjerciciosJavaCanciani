import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas horas al día puedes estudiar? ");
        int horasPorDia = scanner.nextInt();

        System.out.print("Selecciona el nivel de estudio (1: Básico, 2: Intermedio, 3: Avanzado): ");
        int nivel = scanner.nextInt();

        switch (nivel) {
            case 1:
                planBasico(horasPorDia);
                break;
            case 2:
                planIntermedio(horasPorDia);
                break;
            case 3:
                planAvanzado(horasPorDia);
                break;
            default:
                System.out.println("Nivel no válido.");
                break;
        }

        scanner.close();
    }

    private static void planBasico(int horasPorDia) {
        System.out.println("\nPlan de Estudio Básico:");
        System.out.println("Lunes: " + horasPorDia + " horas de Matemáticas");
        System.out.println("Martes: " + horasPorDia + " horas de Lengua");
        System.out.println("Miércoles: " + horasPorDia + " horas de Ciencias");
        System.out.println("Jueves: " + horasPorDia + " horas de Historia");
        System.out.println("Viernes: " + horasPorDia + " horas de Inglés");
        System.out.println("Sábado: " + horasPorDia + " horas de repaso");
        System.out.println("Domingo: Descanso");
    }

    private static void planIntermedio(int horasPorDia) {
        System.out.println("\nPlan de Estudio Intermedio:");
        System.out.println("Lunes: " + horasPorDia + " horas de Matemáticas");
        System.out.println("Martes: " + horasPorDia + " horas de Lengua");
        System.out.println("Miércoles: " + horasPorDia + " horas de Ciencias");
        System.out.println("Jueves: " + horasPorDia + " horas de Historia");
        System.out.println("Viernes: " + horasPorDia + " horas de Inglés");
        System.out.println("Sábado: " + horasPorDia + " horas de un Proyecto");
        System.out.println("Domingo: " + horasPorDia + " horas de repaso");
    }

    private static void planAvanzado(int horasPorDia) {
        System.out.println("\nPlan de Estudio Avanzado:");
        System.out.println("Lunes: " + horasPorDia + " horas de Matemáticas Avanzadas");
        System.out.println("Martes: " + horasPorDia + " horas de Lengua y Literatura");
        System.out.println("Miércoles: " + horasPorDia + " horas de Ciencias Avanzadas");
        System.out.println("Jueves: " + horasPorDia + " horas de Historia y Filosofía");
        System.out.println("Viernes: " + horasPorDia + " horas de Inglés Avanzado");
        System.out.println("Sábado: " + horasPorDia + " horas de Investigación");
        System.out.println("Domingo: " + horasPorDia + " horas de repaso y práctica");
    }
    }
}
