package com.mycompany.w3schools;

public class MostrarVariables {

    public static void main(String[] args) {

        /*
         * El println() el método se utiliza a menudo para mostrar variables.
         * Para combinar texto y una variable, use el + carácter:
         */

        String name = "David";
        System.out.println("Hola " + name);

        // También puedes usar el + carácter para agregar una variable a otra variable:

        String firstName = "David";
        String lastName = "Miranda";
        String fullName = firstName +  " " + lastName;
        System.out.println(fullName);

        /*
         * Para valores numéricos, el + el personaje funciona como matemático operador
         * (observe que usamos int (integer) variables aquí):
         */

        int x = 5;
        int y = 6;
        System.out.println(x + y);

    }

}
