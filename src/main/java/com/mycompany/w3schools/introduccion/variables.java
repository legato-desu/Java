package com.mycompany.w3schools.introduccion;

/* Variables Java
Las variables son contenedores para almacenar valores de datos.

En Java, hay diferentes tipos de variables, por ejemplo:

String  -   almacena texto, como "Hola". Los valores de cadena son rodeado de citas dobles
int     -   almacena enteros (números enteros), sin decimales, como 123 o -123
float   -   almacena números de punto flotante, con decimales, como 19.99 o - 19.99
char    -   almacena caracteres individuales, como 'a' o 'B'. Los valores de los caracteres están rodeados por comillas individuales
boolean -   almacena valores con dos estados: verdadero o falso*/

public class variables {
    public static void main(String[] args) {

        /*
         * Crea una variable llamada nombre de tipo String y asígnalo el valor "David".
         * Entonces usamos println() para imprimir el nombre variable:
         */
        String name = "David";
        System.out.println(name);

        // Crea una variable llamada myNum de tipo int y asígnalo el valor 15:
        int myNum1 = 15;
        System.out.println(myNum1);

        /*
         * También puede declarar una variable sin asignar el valor y asignar el valor
         * más adelante:
         */
        int myNum2;
        myNum2 = 15;
        System.out.println(myNum2);

        // Cambiar el valor de myNum de 15 a 20:
        int myNum3 = 15;
        myNum3 = 20; // myNum is now 20
        System.out.println(myNum3);

        /*
         * Si no desea que otros (o usted mismo) sobrescriban los valores existentes,
         * use el final palabra clave (esto declarará la variable como "final" o
         * "constante", lo que significa inmutable y de solo lectura):
         * 
         * final int myNum4 = 15;
         * myNum4 = 20; will generate an error: cannot assign a value to a final
         * variable
         */

        
        int myNum5 = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        System.out.println("int: " + myNum5);
        System.out.println("float: " + myFloatNum);
        System.out.println("char: " + myLetter);
        System.out.println("boolean: " + myBool);
        System.out.println("string: " + myText);

    }

}
