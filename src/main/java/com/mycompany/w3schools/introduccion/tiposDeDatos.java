package com.mycompany.w3schools.introduccion;

public class tiposDeDatos {

    public static void main(String[] args) {

        /*
         * una variable en Java debe ser un tipo de datos especificado:
         */

        int miNum = 5; // Numero entero
        float miFloatNum = 5.99f; // Numero en coma flotante
        char miLetra = 'D'; // Caracter
        boolean miBool = true; // Booleano
        String miTexto = "Hola"; // Texto

        System.out.println("Entero: " + miNum);
        System.out.println("Flotante: " + miFloatNum);
        System.out.println("Caracter: " + miLetra);
        System.out.println("Booleano: " + miBool);
        System.out.println("Texto: " + miTexto);

        /*
         * Los tipos de datos se dividen en dos grupos:
         * 
         * Tipos de datos primitivos - incluye byte, short, int, long, float, double,
         * boolean y char
         * Tipos de datos no primitivos, como String, Arreglos y Clases (aprenderá más
         * sobre estos en un capítulo posterior)
         */

        /*
         * Tipos de Datos Primitivos
         * Un tipo de datos primitivo especifica el tamaño y el tipo de valores
         * variables, y no tiene métodos adicionales.
         * 
         * Hay ocho tipos de datos primitivos en Java:
         */

        /*
         * Data Type	    Size	    Description
            byte	        1 byte	    Stores whole numbers from -128 to 127
            short	        2 bytes	    Stores whole numbers from -32,768 to 32,767
            int	            4 bytes	    Stores whole numbers from -2,147,483,648 to 2,147,483,647
            long	        8 bytes	    Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
            float	        4 bytes	    Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
            double	        8 bytes	    Stores fractional numbers. Sufficient for storing 15 decimal digits
            boolean	        1 bit	    Stores true or false values
            char	        2 bytes	    Stores a single character/letter or ASCII values
         */
    }

}
