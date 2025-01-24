package Ej3;

import java.util.Scanner;

public class Facturacion {
    // Definir el array de artículos (código, nombre, precio)
    private static final String[][] articulos = {
            {"101", "Leche", "25"},
            {"102", "Gaseosa", "30"},
            {"103", "Fideos", "15"},
            {"104", "Arroz", "28"},
            {"105", "Vino", "120"},
            {"106", "Manteca", "20"},
            {"107", "Lavandina", "18"},
            {"108", "Detergente", "46"},
            {"109", "Jabón en Polvo", "96"},
            {"110", "Galletas", "60"}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear instancia de Factura
        Factura factura = new Factura();

        // Solicitar datos de la factura
        System.out.print("Ingrese la fecha de la factura: ");
        factura.setFechaFactura(scanner.nextLine());

        long numeroFactura;
        do {
            System.out.print("Ingrese el número de factura (mayor a 0): ");
            numeroFactura = scanner.nextLong();
        } while (numeroFactura <= 0);
        factura.setNumeroFactura(numeroFactura);

        scanner.nextLine();  // Limpiar el buffer
        String cliente;
        do {
            System.out.print("Ingrese el nombre del cliente: ");
            cliente = scanner.nextLine();
        } while (cliente.isEmpty());
        factura.setCliente(cliente);

        // Cargar detalles de la factura
        boolean continuar = true;
        while (continuar) {
            String codigoArticulo;
            boolean articuloEncontrado = false;
            // Solicitar código de artículo y buscarlo en el array
            while (!articuloEncontrado) {
                System.out.print("Ingrese el código del artículo a facturar: ");
                codigoArticulo = scanner.nextLine();

                articuloEncontrado = false;
                for (int i = 0; i < articulos.length; i++) {
                    if (articulos[i][0].equals(codigoArticulo)) {
                        articuloEncontrado = true;

                        // Solicitar cantidad
                        System.out.print("Ingrese la cantidad: ");
                        int cantidad = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer

                        // Calcular el descuento si es mayor a 5
                        double precioUnitario = Double.parseDouble(articulos[i][2]);
                        double descuento = 0;
                        if (cantidad > 5) {
                            descuento = precioUnitario * 0.1; // 10% de descuento
                        }

                        // Crear objeto DetalleFactura y agregar a la factura
                        DetalleFactura detalle = new DetalleFactura(
                                articulos[i][0],
                                articulos[i][1],
                                cantidad,
                                precioUnitario,
                                descuento
                        );
                        factura.agregarDetalle(detalle);

                        // Preguntar si desea continuar
                        System.out.print("¿Desea agregar otro artículo? (s/n): ");
                        String respuesta = scanner.nextLine();
                        if (respuesta.equalsIgnoreCase("n")) {
                            continuar = false;
                        }
                        break;
                    }
                }

                if (!articuloEncontrado) {
                    System.out.println("El código ingresado no existe, intente nuevamente.");
                }
            }
        }

        // Calcular el total de la factura
        factura.calcularMontoTotal();

        // Mostrar la factura
        factura.mostrarFactura();

        scanner.close();
    }
}