import java.util.Scanner;

public class Condicional7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuál es tu estado de ánimo actual? (feliz, triste, enérgico, relajado): ");
        String estadoAnimo = scanner.nextLine().toLowerCase();

        String actividadRecomendada;

        switch (estadoAnimo) {
            case "feliz":
                actividadRecomendada = "Juega con amigos o miren una película ";
                break;
            case "triste":
                actividadRecomendada = "Escucha música o lee un buen libro.";
                break;
            case "enérgico":
                actividadRecomendada = "Sal a correr o haz ejercicio.";
                break;
            case "relajado":
                actividadRecomendada = "Medita o disfruta de la vida.";
                break;
            default:
                actividadRecomendada = "Estado de ánimo no válido.";
                break;
        }
        System.out.println("Actividad recomendada: " + actividadRecomendada);

    }
}
