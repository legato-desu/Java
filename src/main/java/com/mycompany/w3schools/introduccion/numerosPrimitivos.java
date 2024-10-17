package com.mycompany.w3schools.introduccion;

public class numerosPrimitivos {
    public static void main(String[] args) {

        /*
         * Números
         * Los tipos de números primitivos se dividen en dos grupos:
         * 
         * Tipos de enteros almacena números enteros, positivos o negativos (como 123 o
         * -456), sin decimales. Los tipos válidos son byte, short, int y long. El tipo
         * que debe usar depende del valor numérico.
         * 
         * Tipos de puntos flotantes representa números con una parte fraccional, y que
         * contenga uno o más decimales. Hay dos tipos: float y double.
         */

        /*
         * Tipos de Integrador
         * Byte
         * El byte el tipo de datos puede almacenar números enteros de -128 a 127. Esto
         * se puede utilizar en lugar de int u otros tipos enteros a guarde memoria
         * cuando esté seguro de que el valor estará dentro de -128 y 127:
         */

        byte miNum1 = 100;
        System.out.println("Byte: " + miNum1);

        /*
         * Corto
         * El short el tipo de datos puede almacenar números enteros desde -32768 hasta
         * 32767:
         */

        short miNum2 = 5000;
        System.out.println("Short: " + miNum2);

        /*
         * Int
         * El int el tipo de datos puede almacenar números enteros desde -2147483648
         * hasta 2147483647. En general, y en nuestro tutorial, el int el tipo de datos
         * es el tipo de datos preferido cuando creamos variables con un valor numérico.
         */

        int miNum3 = 100000;
        System.out.println("Int: " + miNum3);

        /*
         * Largo
         * El long el tipo de datos puede almacenar números enteros desde
         * -9223372036854775808 hasta 9223372036854775807. Esto se usa cuando int no es
         * lo suficientemente grande como para almacenar el valor. Tenga en cuenta que
         * debe finalizar el valor con una "L":
         */

        long miNum4 = 15000000000l;
        System.out.println("Long: " + miNum4);

        /*
         * Tipos de Puntos Flotantes
         * Debe usar un tipo de punto flotante siempre que necesite un número con un
         * decimal, como 9.99 o 3.14515.
         * 
         * El float y double los tipos de datos pueden almacenar números fraccionarios.
         * Tenga en cuenta que debe finalizar el valor con una "f" para flotadores y "d"
         * para dobles:
         */

        float miNum5 = 5.75f;
        System.out.println("Float: " + miNum5);

        double miNum6 = 19.99d;
        System.out.println("Double: " + miNum6);

        /*
         * Usar float o double¿?
         * 
         * El precisión de un valor de punto flotante indica cuántos dígitos puede tener
         * el valor después del punto decimal. La precisión de float es sólo seis o
         * siete dígitos decimales, mientras double las variables tienen una precisión
         * de unos 15 dígitos. Por lo tanto, es más seguro de usar double para la
         * mayoría de los cálculos.
         */

        /*
         * Números Científicos
         * Un número de punto flotante también puede ser un número científico con una
         * "e" para indicar la potencia de 10:
         */

        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println("Numeros cientificos: 'e' ");
        System.out.println("Float: " + f1);
        System.out.println("Double: " + d1);
    }
}