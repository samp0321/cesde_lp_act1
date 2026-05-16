package com.example;

public class EstructurasCondicionales {
    public static void ejemploIf() {
        int edad = 18;
        System.out.print("Edad:" + edad);
        if (edad >= 18) {
            System.out.println("Eres mayor de edad, puedes votar");
        } 
    }

    public static void ejemploIfElse() {
        int edad = 18;
        System.out.print("Edad:" + edad);
        if (edad >= 18) {
            System.out.println("Eres mayor de edad, puedes votar");
        } else {
            System.out.println("Eres menor de edad, no puedes votar");
        }
    }

    public static void ejemploIfElseIfElse() {
        int edad = 17;
        System.out.print("Edad:" + edad);
        if (edad >= 18) {
            System.out.println("Eres mayor de edad, puedes votar");
        } else if (edad >= 16) {
            System.out.println("Eres casi mayor de edad, pero sigues sin poder votar");
        } else {
            System.out.println("Eres menor de edad, no puedes votar.");
        }
    }

    public static void ejemploSwitch() {
        int diaSemana = 3;
        switch (diaSemana) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número de día no válido");
        }
    }

    public static void ejemploSwitchExpression() {
        int diaSemana = 3;
        String nombreDia = switch (diaSemana) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Número de día no válido";
        };
        System.out.println("El día de la semana es: " + nombreDia);
        
    }
}