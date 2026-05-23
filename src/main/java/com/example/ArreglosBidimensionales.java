package com.example;

public class ArreglosBidimensionales {
    public static void declararCrearMatrices() {
        int[][] cuadricula = new int[3][3];
        
        cuadricula[0][0] = 1;
        cuadricula[0][1] = 2;
        cuadricula[1][0] = 3;
        cuadricula[1][1] = 4;

        System.out.println("Elemento en la posición [0][0]: " + cuadricula[0][0]);
    }

    public static void recorrerMatriz() {
        int[][] matriz3x3 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sumaTotal = 0;

        for (int i = 0; i < matriz3x3.length; i++) {
            for (int j = 0; j < matriz3x3[i].length; j++) {
                sumaTotal += matriz3x3[i][j];
            }
        }

        System.out.println("La suma total de los elementos de la matriz es: " + sumaTotal);
    }

    public static void ejemploUsosTipicos() {
        // TODO
    }
}