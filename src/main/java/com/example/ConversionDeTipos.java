package com.example;

public class ConversionDeTipos {
    public static void demostrarCastingImplicitito() {
        int numeroEntero = 800;
        double numeroDecimal = numeroEntero;
        System.out.println("int: " + numeroEntero);
        System.out.println("Resultado double: " + numeroDecimal);
    }

    public static void demostrarCastingExplicito() {
        double numeroDecimal = 3.14;
        int numeroEntero = (int) numeroDecimal;
        System.out.println("double: " + numeroDecimal);
        System.out.println("Resultado int: " + numeroEntero);
    }

    public static void demostrarProblemasDePrecision() {
        long numeroGrande = 1234567890123456789L;
        short numeroPequeno = (short) numeroGrande;
        System.out.println("Long: " + numeroGrande);
        System.out.println("Resultado short: " + numeroPequeno);
    }
}