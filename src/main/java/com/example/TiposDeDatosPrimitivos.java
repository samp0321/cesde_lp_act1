package com.example;

public class TiposDeDatosPrimitivos {
    public static void demostrarEnteros() {
        byte dato1 = 100;
        short dato2 = 15000;
        int dato3 = 2000000000;
        long dato4 = 50000000000L;

        System.out.println("Byte: " + dato1);
        System.out.println("Short: " + dato2);
        System.out.println("Int: " + dato3);
        System.out.println("Long: " + dato4);
    }

    public static void demostrarFlotantes() {
        float precioCafe =  1.5f;
        double precioCafeDolar = 3.5;
        System.out.println("Precio del café (float): " + precioCafe);
        System.out.println("Precio del café (double): " + precioCafeDolar);
    }

    public static void demostrarCaracteres() {
        char miInicial = 'S';
        System.out.println("Mi inicial es: " + miInicial);
    }

    public static void demostrarBooleanos() {
        boolean estadoLuz = true;
        System.out.println("El estado de la luz es: " + estadoLuz);
    }

    public static void demostrarValoresPorDefecto() {
        String nombre;
    }
}

//ASD