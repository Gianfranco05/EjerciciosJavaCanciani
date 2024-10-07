import java.util.Scanner;

public class Condicional6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas horas al día dormis? ");
        int horasSueño = scanner.nextInt();

        System.out.print("¿Cuántas horas al día haces ejercicio? ");
        int horasEjercicio = scanner.nextInt();

        System.out.print("¿Cuántas comidas saludables consumis por día? ");
        int comidasSaludables = scanner.nextInt();

        String evaluacion = evaluarHabitos(horasSueño, horasEjercicio, comidasSaludables);

        System.out.println("Evaluación de tus hábitos saludables: " + evaluacion);

        scanner.close();
    }

    private static String evaluarHabitos(int horasSueño, int horasEjercicio, int comidasSaludables) {
        if (horasSueño < 7) {
            return "Deberías dormir más para mejorar tu salud.";
        } else if (horasEjercicio < 1) {
            return "Intenta hacer más ejercicio, pero vas bien.";
        } else if (comidasSaludables < 3) {
            return "Consume más comidas saludables en tu dieta, una buena alimentaciión es fundamental.";
        } else {
            return "¡Tenes hábitos saludables! seguí así.";
        }
    }
}
