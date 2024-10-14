package Funciones;
public class Func7 {
    public static void main(String[] args) {
        double[] compras = {450.0, 600.0, 300.0, 700.5, 500.0};
        aplicarDescuento(compras);
    }

    public static void aplicarDescuento(double[] compras) {
        double tasaDescuento = 0.15;
        System.out.println("Montos de las compras y loss descuentos:");
        for (double compra : compras) {
            if (compra > 500) {
                double descuento = compra * tasaDescuento;
                double montoFinal = compra - descuento;
                System.out.println("Compra: $" + compra + " - Descuento: $" + descuento + " - Total después del descuento: $" + montoFinal);
            } else {
                System.out.println("Compra: $" + compra + " - No aplica descuento.");
            }
        }
    }
}
