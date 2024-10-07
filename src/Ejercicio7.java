import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Satisfacción (1-10): ");
        int satisfaccion = sc.nextInt();

        System.out.print("Estrés (1-10): ");
        int estres = sc.nextInt();

        System.out.print("Salud (1-10): ");
        int salud = sc.nextInt();

        double indice = (satisfaccion - estres + salud) / 2.0;
        System.out.printf("Índice de felicidad: %.2f\n", indice);

        if (indice >= 8) {
            System.out.println("¡Que Felicidaad!");
        } else if (indice >= 5) {
            System.out.println("Estas feliz de manera moderada");
        } else {
            System.out.println("Necesitas hacer algunos cambios, pero tranqui todo va a estar bien.");
        }
    }
}
