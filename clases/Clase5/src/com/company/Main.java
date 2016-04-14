package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args)  throws Exception {

        //define el objeto bufferedReader
        BufferedReader t = new BufferedReader ( new InputStreamReader(System.in));
        //mensaje para el usuario final (sin salto de linea)

        //cadena

        System.out.print("Ingresa tu Nombre: ");
        //variable que recibe el valor
        String nombre=t.readLine();

        //entero

        int edad;
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(t.readLine());

        /*int valor = 0;
        char sexo;
        System.out.print("Es usted M o F : ");
        while ((valor = t.read()) != -1){
            char sexo = (char)valor;*/


        double salario;
        System.out.print("Ingrese su Salario: ");
        salario = Double.parseDouble(t.readLine());

        System.out.println("Hola,"+ nombre + ". Tienes " + edad + " años. ");

        double salarioneto = salario * 0.80;
        System.out.println("Tu Salario neto es $" + salarioneto);

        }
    }
