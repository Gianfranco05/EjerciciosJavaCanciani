import java.util.Scanner;
public class Ejercicio3 {

    static String principiante = """
            Flexiones: 3 series de 12 repeticiones.
            Plancha: 3 series de 30 segundos.
            Elevaciones Laterales: 3 series de 12 repeticiones.
            Sentadillas: 3 series de 12 repeticiones.""";
    static String intermedio = """
            Flexiones: 3 series de 12 repeticiones.
            Plancha : 3 series de 30 segundos por lado.
            Sentadillas: 3 series de 12 repeticiones.
            Burpees: 3 series de 12 repeticiones.""";
    static String avanzado = """
            Flexiones: 3 series de 12 repeticiones.
            Plancha: 4 series de 30 segundos.
            Zancadas: 4 series de 12 repeticiones.
            Burpees: 3 series de 12 repeticiones.""";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nivel en el que se encuentra: \n1. Principiante \n2. Intermedio \n3. Avanzado \n Mi nivel es: ");
        int opcion;
        opcion = sc.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Rutina de principiantes: \n");
                System.out.println(principiante);
                break;
            case 2:
                System.out.println("Rutina Intermedia: \n");
                System.out.println(intermedio);
                break;
            case 3:
                System.out.println("Rutina Avanzada: \n");
                System.out.println(avanzado);
                break;
            default:
                System.out.println("Opcion incorrecta.");
        }
    }
}
