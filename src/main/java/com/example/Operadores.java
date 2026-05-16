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
        int n = 5;
        System.out.println("Valor inicial n: " + n);
        System.out.println("n++ (post-incremento): " + (n++));
        System.out.println("Valor de n después de n++: " + n);

        n = 5;
        System.out.println("++n (pre-incremento): " + (++n));
        System.out.println("Valor de n después de ++n: " + n);

        int m = 5;
        System.out.println("m-- (post-decremento): " + (m--));
        System.out.println("Valor de m después de m--: " + m);

        m = 5;
        System.out.println("--m (pre-decremento): " + (--m));
        System.out.println("Valor de m después de --m: " + m);
    }

    public static void demostrarRelacionales() {
        int a = 10;
        int b = 20;
        System.out.println("a > b? " + (a > b));
        System.out.println("a < b? " + (a < b));
        System.out.println("a == b? " + (a == b));
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