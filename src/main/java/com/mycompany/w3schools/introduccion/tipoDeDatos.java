package com.mycompany.w3schools.introduccion;

public class tipoDeDatos {

    public static void main(String[] args) {

        /*
         * Aquí hay un ejemplo de la vida real del uso de diferentes tipos de datos,
         * para calcular y generar el costo total de una serie de elementos:
         */

        // Crea variables de diferentes tipos de datos
        int elementos = 50;
        float costoElemento = 9.99f;
        float costoTotal = elementos * costoElemento;
        char moneda = '$';

        //  imprime variables
        System.out.println("Numero de elementos: " + elementos);
        System.out.println("Costo por elemento: " + costoElemento + moneda);
        System.out.println("Costo total: " + costoTotal + moneda);

    }

}
