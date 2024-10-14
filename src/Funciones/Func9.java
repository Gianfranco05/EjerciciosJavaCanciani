package Funciones;

public class Func9 {
    public static void main(String[] args) {
        double[] preciosOriginales = {100.0, 250.5, 80.0, 150.75, 60.0};

        PrecioFinal(preciosOriginales);
    }
public static void PrecioFinal(double[] preciosOriginales) {
        double tasaDescuento = 0.10;

        System.out.println("Precios finales después del descuento:");
        for (double precio : preciosOriginales) {
            double descuento = precio * tasaDescuento;
            double precioFinal = precio - descuento;
            System.out.println("Precio original: $" + precio + " - Precio final: $" + precioFinal);
        }
    }
}
