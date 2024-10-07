import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la distancia del viaje: ");
        float distancia = sc.nextFloat();

        System.out.println("Ingrese el consumo de litros x kilometro: ");
        float consumo = sc.nextFloat();
        System.out.println("Ingrese el precio del combustible: ");
        float precio = sc.nextFloat();
        double total = distancia * consumo * precio;
        System.out.println("El total es: " + total);
    }
}
