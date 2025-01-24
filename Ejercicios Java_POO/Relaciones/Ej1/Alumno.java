package Ej1;

import java.util.ArrayList;

public class Alumno {
    private String nombreCompleto;
    private long legajo;
    private ArrayList<Nota> notas;

    // Constructor
    public Alumno(String nombreCompleto, long legajo) {
        this.nombreCompleto = nombreCompleto;
        this.legajo = legajo;
        this.notas = new ArrayList<>();
    }

    // Métodos getter
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public long getLegajo() {
        return legajo;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    // Método para agregar una nota
    public void agregarNota(Nota nota) {
        notas.add(nota);
    }

    // Método para calcular el promedio de las notas
    public double calcularPromedio() {
        if (notas.isEmpty()) {
            return 0.0; // Retorna 0 si no hay notas
        }
        double suma = 0;
        for (Nota nota : notas) {
            suma += nota.getNotaExamen();
        }
        return suma / notas.size();
    }
}