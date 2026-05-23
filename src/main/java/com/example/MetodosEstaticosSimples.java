package com.example;

public class MetodosEstaticosSimples {
    public static void ejemploDeclaracionLlamada() {
        System.out.println("======================================");
        System.out.println("Declaración Llamada");
        System.out.println("======================================");
        System.out.println();
        }

    public static void ejemploPasoParametros(String nombre) {
        System.out.println("======================================");
        System.out.println("Paso de Parámetros");
        System.out.println("======================================");
        System.out.println("Hola, bienvenido " + nombre);
        System.out.println();
    }

    public static int ejemploRetornoValores() {
        int tres = 3;
        int resultado = tres + tres;

        System.out.println("======================================");
        System.out.println("Retorno de Valores");
        System.out.println("======================================");
        System.out.println("Resultado: " + resultado);
        System.out.println();

        return resultado;
    }

    public static void ejemploSobrecarga() {
        System.out.println("======================================");
        System.out.println("Sobrecarga sin parámetros");
        System.out.println("======================================");
        System.out.println();
    }

    public static void ejemploSobrecarga(int n) {
        System.out.println("======================================");
        System.out.println("Sobrecarga con un parámetro: " + n);
        System.out.println("======================================");
        System.out.println();
    }
}