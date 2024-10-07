import java.util.Scanner;
public class Condicional3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuál es tu género de libro favorito? (fantasía, misterio, romance, ciencia ficción): ");
        String genero = scanner.nextLine().toLowerCase();

        String libroRecomendado;

        switch (genero) {
            case "fantasía":
                libroRecomendado = "El Hobbit de J.R.R. Tolkien";
                break;
            case "misterio":
                libroRecomendado = "La chica del tren de Paula Hawkins";
                break;
            case "romance":
                libroRecomendado = "Orgullo y prejuicio de Jane Austen";
                break;
            case "ciencia ficción":
                libroRecomendado = "Dune de Frank Herbert";
                break;
            default:
                libroRecomendado = "Género no válido.";
                break;
        }

        System.out.println("Recomendación: " + libroRecomendado);

    }
}
