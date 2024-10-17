package com.mycompany.w3schools.introduccion;

public class variablesMultiples {

    public static void main(String[] args) {

        /*
         * Para declarar mas de una variable del mismo tipo, puedes usar una lista
         * separada por comas
         */

        // En lugar de escribir:
        int x = 5;
        int y = 6;
        int z = 50;
        System.out.println(x + y + z);

        // Simplemente escribir
        int a = 5, b = 6, c = 50;
        System.out.println(a + b + c);

        // También puede asignar el mismo valor a múltiples variables en una línea:
        int p,q,r;
        p = q = r = 50;
        System.out.println(p + q + r);
    }

}
