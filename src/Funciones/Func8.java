package Funciones;

public class Func8 {
    public static void main(String[] args) {
        String[] empleados = {"Juan Pérez", "María López", "Carlos García", "Ana Martínez", "Luis Torres"};
        int[] horasTrabajadas = {40, 35, 45, 50, 30};
        PagoSemanal(empleados, horasTrabajadas);
    }

    public static void PagoSemanal(String[] empleados, int[] horasTrabajadas) {
        double tarifaPorHora = 15.0;
        System.out.println("Pagos semanales:");
        for (int i = 0; i < empleados.length; i++) {
            double pago = horasTrabajadas[i] * tarifaPorHora;
            System.out.println(empleados[i] + " - Pago semanal: $" + pago);
        }
    }
}
