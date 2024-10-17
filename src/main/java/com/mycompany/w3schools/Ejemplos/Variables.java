package com.mycompany.w3schools.Ejemplos;

public class Variables {

    public static void main(String[] args) {

        /*
         * A menudo, en nuestros ejemplos, simplificamos los nombres de variables para
         * que coincidan con su tipo de datos (myInt o myNum para int tipos, myChar para
         * char tipos, etc.). Esto se hace para evitar confusiones.
         * 
         * Sin embargo, para un ejemplo práctico de uso de variables, hemos creado un
         * programa que almacena diferentes datos sobre un estudiante universitario:
         */

        // Datos de estudiante

        String estudianteNombre = "David Miranda";
        int estudianteID = 15;
        int estudianteEdad = 29;
        float estudianteTarifa = 780.35f;
        char estudianteGrado = 'A';

        // Imprimir las variables
        System.out.println("Nombre: " + estudianteNombre);
        System.out.println("ID:  " + estudianteID);
        System.out.println("Edad: " + estudianteEdad);
        System.out.println("Tarifa: " + estudianteTarifa);
        System.out.println("Grado: " + estudianteGrado);

        /*
         * Calcule el Área de un Rectángulo
         * En este ejemplo de la vida real, creamos un programa para calcular el área de
         * un rectángulo (multiplicando la longitud y el ancho):
         */

        // Crear variables enteras
        int base = 4;
        int altura = 6;
        int area;

        // Calcular el area de un rectangulo
        area = altura * base;

        // Imprimir variables
        System.out.println("La base es: " + base);
        System.out.println("La altura es: " + altura);
        System.out.println("El area del circulo es: " + area);
    }

}
