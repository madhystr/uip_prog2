package com.company;

public class Main {

    public static void main(String[] args) {
        //tipos de datos en Java
       //enteros

        byte a= 100;
        short c= 10000;
        int m= 1500;
        long l= 1500L;

       //decimales

        float f1= 234.5f;
        double d1=213.4;

        //booleanos

        boolean one = true;
        boolean two = false;

        //caracteres

        char letraA= 'A';

        String mensaje = "Hola Mundo";

       //para crear una variable puede ser valido Aa$_ como primer caracter y desps puede ser cualquiera de estos o #

        // ejemplos para declarar una variable //

        int edad;
        edad= 0;

        String nombre = "Carlos";

        double nota1,nota2,nota3;

        /*
        esto es para un comentario
        de varias lineas
         */

        /*definicion de constante se debe escribir la palabra final al principio
         y para una buena practica de programacion la variable se puede escribir
         en mayuscula cerrada para identificar mas rapido
        */

        final String DEPARTAMENTO= "Finanzas";

        System.out.println("Hola Panamá");

        //operadores puedes ser logicos, relacionales y arigmeticos

        System.out.println("Suma: " + (a + m));
        System.out.println("Resta: " + (a - m));
        System.out.println("Multiplicación: " + (a * m));
        System.out.println("División: " + (a / m));
        System.out.println("Residuo: " + (a % m));
        System.out.println("Incremento: " + (a++));
        System.out.println("Decremento: " + (a--));



    }
}
