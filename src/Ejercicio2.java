import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu peso en kilogramos: ");
        double peso = sc.nextDouble();

        System.out.print("Introduce la duración del ejercicio en minutos: ");
        int minutos = sc.nextInt();

        System.out.print("Introduce el tipo de ejercicio (correr, nadar, andar en bicicleta): ");
        String ejercicio = sc.next();

        double caloriasPorMinuto;

        switch (ejercicio.toLowerCase()) {
            case "correr":
                caloriasPorMinuto = 10; // Ejemplo de calorías quemadas por minuto
                break;
            case "nadar":
                caloriasPorMinuto = 7;
                break;
            case "andar":
                caloriasPorMinuto = 5;
                break;
            default:
                System.out.println("Tipo de ejercicio no válido.");
                sc.close();
        }

        double caloriasQuemadas = caloriasPorMinuto * peso * minutos / 60;
        System.out.printf("Calorías quemadas: %.2f\n", caloriasQuemadas);

    }
}
