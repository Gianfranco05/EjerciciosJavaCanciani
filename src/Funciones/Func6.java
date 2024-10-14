package Funciones;
public class Func6 {
    public static void main(String[] args) {
        double[] facturas = {100.0, 200.5, 50.75, 150.0, 80.25};
        calcularImpuesto(facturas);
    }

    public static void calcularImpuesto(double[] facturas) {
        double tasaImpuesto = 0.21;
        System.out.println("Monto de las facturas e impuesto:");
        for (double factura : facturas) {
            double impuesto = factura * tasaImpuesto;
            System.out.println("Factura: $" + factura + " - Impuesto: $" + impuesto);
        }
    }

}
