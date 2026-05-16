package com.example;

public class Operadores {
    public static void demostrarAritmeticos() {
        double nota1 = 4.3;
        double nota2 = 5.0;
        double nota3 = 1.4;
        double notaFinal = (nota1 + nota2 + nota3) / 3;
        System.out.println("Nota final: " + notaFinal);
    }

    public static void demostrarIncrementoDecremento() {

    }

    public static void demostrarRelacionales() {

    }

    public static void demostrarLogicos() {
        int numero = 25;
        boolean esMayorQue10 = numero > 10;
        boolean esMenorQue50 = numero < 50;
        boolean resultado = esMayorQue10 && esMenorQue50;

        System.out.println("Número: " + numero);
        System.out.println("¿Mayor que 10? " + esMayorQue10);
        System.out.println("¿Menor que 50? " + esMenorQue50);
        System.out.println("¿Mayor que 10 y menor que 50? " + resultado);
    }

    public static void demostrarAsignacionCompuesta() {
        // TODO
    }

    public static void demostrarOperadorTernario() {
        // TODO
    }
}