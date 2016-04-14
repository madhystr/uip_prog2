package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner t;

    public static void main(String[] args) {

        String nombre;
        int edad;

        t = new Scanner(System.in);
        System.out.print("ingrese su nombre: ");
        nombre = t.next();

        System.out.print("ingrese su edad: ");
        edad = t.nextInt();

        System.out.println(nombre + ", tienes " + edad + "años" );





    }
}
