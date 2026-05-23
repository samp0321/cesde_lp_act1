package com.example;

public class ArreglosUnidimensionales {
    public static void declararCrearInicializar() {
    }

    public static void mostrarLongitud() {
        // TODO
    }

    public static void recorrerConForClasico() {
        String[] peliculas = new String[5];
        peliculas[0] = "El Padrino";
        peliculas[1] = "El Señor de los Anillos";
        peliculas[2] = "Forrest Gump";
        peliculas[3] = "Inception";
        peliculas[4] = "Matrix";

        for (int i = 0; i < peliculas.length; i++) {
            System.out.println(peliculas[i]);
        }
    }

    public static void recorrerConForEach() {
        String[] peliculas = new String[5];
        peliculas[0] = "El Padrino";
        peliculas[1] = "El Señor de los Anillos";
        peliculas[2] = "Forrest Gump";
        peliculas[3] = "Inception";
        peliculas[4] = "Matrix";

        for (String pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    public static int[] arrayComoParametroYRetorno(int[] array) {
        // TODO
        return array;
    }
}