import java.util.Scanner;

public class ej4_1 {
    static String Feliz = """
        Segun su estado de animo se le recomienda escuchar:
        
        Happy – Pharrell Williams
        Uptown Funk – Mark Ronson ft. Bruno Mars
        Walking on Sunshine – Katrina and the Waves
        """;

    static String Triste = """
        Segun su estado de animo se le recomienda escuchar:
        
        Fix You – Coldplay
        Let Her Go – Passenger
        Back to December – Taylor Swift
        """;

    static String Energico = """
        Segun su estado de animo se le recomienda escuchar:
        
        Can't Hold Us – Macklemore & Ryan Lewis
        Jump Around – House of Pain
        Run the World (Girls) – Beyoncé
        """;

    static String Relajado = """
        Segun su estado de animo se le recomienda escuchar:
        
        Ocean Eyes – Billie Eilish
        Buddah – Moby
        Stay – The Kid LAROI & Justin Bieber
        """;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Como se encuentra hoy? \n1. Feliz \n2. Triste \n3. Enérgico \n4. Relajado \nIngrese su estado de animo: ");
        int animo = sc.nextInt();
        switch (animo) {
            case 1:
                System.out.println(Feliz);
                break;
            case 2:
                System.out.println(Triste);
                break;
            case 3:
                System.out.println(Energico);
                break;
            case 4:
                System.out.println(Relajado);
                break;
            default:
                System.out.println("No disponible");
                break;
        }
    }
}