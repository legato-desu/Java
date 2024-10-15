package com.mycompany.w3schools;

public class identificadores {

    public static void main(String[] args) {

        /*
         * Todo Java variables debe ser identificado con nombres únicos.
         * Estos nombres únicos se llaman identificadores.
         * Los identificadores pueden ser nombres cortos (como x e y) o nombres más
         * descriptivos (edad, suma, volumen total).
         * Nota: Se recomienda utilizar nombres descriptivos para crear código
         * comprensible y mantenible:
         */

        // Bien:
        int minutosPorHora = 60;
        System.out.println("Entendible " + minutosPorHora);

        // Bien pero no es facil de entender lo que m es en realidad
        int m = 60;
        System.out.println("No recomendable " + m);


        /*
         * Las reglas generales para nombrar variables son:
         * 
         * Los nombres pueden contener letras, dígitos, guiones bajos y signos de dólar
         * Los nombres deben comenzar con una letra
         * Los nombres deben comenzar con una letra minúscula y no pueden contener
         * espacios en blanco
         * Los nombres también pueden comenzar con $ y _
         * Los nombres son sensibles a los casos ("myVar" y "myvar" son variables
         * diferentes)
         * Palabras reservadas (como palabras clave de Java, como int o boolean) no se
         * puede utilizar como nombres
         */

    }

}
