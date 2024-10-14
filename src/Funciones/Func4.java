package Funciones;
public class Func4 {
    public static void main(String[] args) {
        String[] clientes = {"Juan Pérez", "María López", "Carlos García", "Ana Martínez", "Luis Torres"};
        int[] compras = {5, 12, 8, 15, 7};
        Descuentos(clientes, compras);
    }

    public static void Descuentos(String[] clientes, int[] compras) {
        System.out.println("Clientes con descuentos:");
        for (int i = 0; i < clientes.length; i++) {
            if (compras[i] > 10) {
                System.out.println(clientes[i] + " - Descuento: 10%");
            }
        }
    }
}
