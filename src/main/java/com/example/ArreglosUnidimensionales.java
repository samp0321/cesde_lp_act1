package com.example;

public class ArreglosUnidimensionales {
    public static void declararCrearInicializar() {

    int numeros[] = {734, 384, 824, 234, 984, 123, 456, 789, 321, 654};
    int numeroMenor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < numeroMenor) {
                numeroMenor = numeros[i];
            }
        }
        System.out.println("El número menor es: " + numeroMenor);
    }

    public static void mostrarLongitud() {
        String[]calendario = {
        "Enero", 
        "Febrero", 
        "Marzo", 
        "Abril", 
        "Mayo", 
        "Junio", 
        "Julio", 
        "Agosto", 
        "Septiembre", 
        "Octubre", 
        "Noviembre", 
        "Diciembre"};
        System.out.println("El número de meses en el calendario es: " + calendario.length);
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
        int edad = array.length;
        int[] arrayP = new int[edad];
        for (int i = 0; i < edad; i++) {
            arrayP[edad - 1 - i] = i + 1;
            System.out.println(arrayP[i]);
        }
        return arrayP;
    }
}