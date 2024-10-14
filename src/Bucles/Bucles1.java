package Bucles;

import javax.swing.*;

public class Bucles1 {
    public static void main(String[] args) {
        int horasEstudiar = 0;
        int horasEjercicios = 0;
        int horasLeer = 0;
        int horasTiempoLibre = 0;

        String[] actividades = {"Estudiar", "Hacer ejercicios", "Leer", "Tiempo libre"};
        int[] horas = new int[actividades.length];

        for (int i = 0; i < actividades.length; i++) {
            boolean entradaValida = false;

            while (!entradaValida) {
                String input = JOptionPane.showInputDialog("Ingrese las horas que pasa en " + actividades[i] + ":");

                if (input != null && !input.trim().isEmpty()) {
                    horas[i] = Integer.parseInt(input);
                    entradaValida = true;
                } else {
                    JOptionPane.showMessageDialog(null, "ingrese un número válido.");
                }
            }
        }

        horasEstudiar = horas[0];
        horasEjercicios = horas[1];
        horasLeer = horas[2];
        horasTiempoLibre = horas[3];

        int tiempoTotal = horasEstudiar + horasEjercicios + horasLeer + horasTiempoLibre;

        String mensaje = String.format("Tiempo total dedicado:\nEstudiar: %d horas\nHacer ejercicios: %d horas\nLeer: %d horas\nTiempo libre: %d horas\n\nTotal: %d horas",
                horasEstudiar, horasEjercicios, horasLeer, horasTiempoLibre, tiempoTotal);
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
