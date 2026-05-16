package com.example;

public class VariablesYConstantes {
    public static void demostrarDeclaracionAsignacion() {        
        int edad = 18;
        double estatura = 1.75;

        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura + "m");
    }

    public static void demostrarConvencionesNombres() {
        int puntuacionMaximaJuego = 100;
        System.out.println("Puntuación máxima del juego: " + puntuacionMaximaJuego);
    }

    public static void demostrarConstantes() {
        final double PI = 3.14159;
        System.out.println("Valor de PI: " + PI);
    }
}