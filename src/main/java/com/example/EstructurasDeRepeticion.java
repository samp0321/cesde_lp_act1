package com.example;
import java.util.Scanner;

public class EstructurasDeRepeticion {
    public static void ejemploWhile() {
        int contador = 10;
        while (contador >= 1) {
            System.out.println("Cuenta regresiva: " + contador);
            contador--;
        }
    }

    public static void ejemploDoWhile() {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int cero = 0;

        do {
            System.out.print("Ingrese el número 0 para continuar: ");
            numero = scanner.nextInt();
            
            if (numero == cero) {
                System.out.println("¡Gracias por ingresar el número 0!");
            } else {
                System.out.println("Número incorrecto. Intente nuevamente.");
            }
        } while (numero != cero);
    }

    public static void ejemploForClasico() {
        System.out.println("Tabla del 12");
        for (int i = 1; i <= 10; i++) {
            System.out.println("12 x " + i + " = " + (12 * i));
        }
    }

    public static void ejemploForAnidado() {
        for (int i = 1; i <= 10; i++) {
            System.out.println();
            System.out.println("Tabla del " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

    public static void ejemploBreakContinue() {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            for (int numero : numeros) {
                if (numero == 7) {
                    System.out.println("Número: 7, Encontrado, deteniendo el bucle.");
                    break;
                }
                System.out.println("Número: " + numero);
            }
    }

    public static void ejemploEtiquetas() {
        // TODO
    }
}