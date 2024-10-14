package Funciones;
public class Func3 {
    public static void main(String[] args) {
        String[] clientes = {"Juan Pérez", "María López", "Carlos García", "Ana Martínez", "Luis Torres"};
        double[] facturasPendientes = {450.0, 600.5, 300.75, 800.0, 150.0};

        enviarFacturas(clientes, facturasPendientes);
    }

    public static void enviarFacturas(String[] clientes, double[] facturasPendientes) {
        System.out.println("Clientes con facturas pendientes mayores a $500:");
        for (int i = 0; i < clientes.length; i++) {
            if (facturasPendientes[i] > 500) {
                System.out.println(clientes[i]);
            }
        }
    }
}
