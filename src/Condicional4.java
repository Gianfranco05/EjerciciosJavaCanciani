import java.util.Scanner;
public class Condicional4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu peso en kilos: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingresa tu altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("Tu IMC es: %.2f\n", imc);

        String recomendacion;
        if (imc < 18.5) {
            recomendacion = "Necesitas comer más y considerar un plan de nutrición.";
        } else if (imc < 24.9) {
            recomendacion = "¡Buen trabajo! Mantén tu estilo de vida saludable.";
        } else if (imc < 29.9) {
            recomendacion = "Considera hacer una dieta equilibrada y ejercicio regular.";
        } else {
            recomendacion = "Necesitas hacer una dieta y aumentar tu actividad física.";
        }

        System.out.println("Recomendación: " + recomendacion);
    }
}
