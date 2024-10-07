import java.util.Scanner;

public class Condicional1 {
    static String accion = """
            Acción: 300 (2006) Descripción: Basada en la novela gráfica de Frank Miller, "300" narra la épica batalla de las Termópilas, donde el rey Leónidas y 300 guerreros espartanos luchan valientemente contra el vasto ejército persa de Jerjes.
            """;
    static String comedia = """
            Comedia: Son como niños (2010) Descripción: Un grupo de amigos de la infancia se reúne tras la muerte de su entrenador de baloncesto. Deciden pasar un fin de semana en una cabaña y revivir sus días de gloria, pero se enfrentan a las responsabilidades de la vida adulta y las diferencias que han surgido con el tiempo.
            """;
    static String drama = """
            Drama: Orgullo y prejuicio (2005) Descripción: Adaptación de la novela clásica de Jane Austen, esta película sigue la vida de Elizabeth Bennet, una joven inteligente y decidida en la Inglaterra del siglo XIX. A medida que navega por el amor, los prejuicios y las expectativas sociales, se enfrenta a su relación con el orgulloso Mr. Darcy.
            """;
    static String ciencia_ficcion = """
            Ciencia ficción: Iron Man (2008)Descripción: La película que lanzó el Universo Cinematográfico de Marvel, "Iron Man" sigue la historia de Tony Stark, un industrial y genio inventor que, tras ser secuestrado, crea una armadura avanzada para escapar.
            """;
    public static String pelicula(int opcion){
        return switch (opcion) {
            case 1 -> accion;
            case 2 -> comedia;
            case 3 -> drama;
            case 4 -> ciencia_ficcion;
            default -> "Opcion no valida.";
        };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el genero de peliula que desea ver \n1. Acción \n2. Comedia \n3. Drama \n4. Ciencia Ficción \nQue genero verá? ");
        try{
            int op = sc.nextInt();
            System.out.println(pelicula(op));
        } catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}
