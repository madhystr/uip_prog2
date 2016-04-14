package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader t = new BufferedReader ( new InputStreamReader(System.in));

        System.out.println("CENTRO EDUCATIVO ABC");
        System.out.println("SISTEMA DE MATRICULAS ONLINE");

        //System.out.println("\nLOS CURSOS DISPONIBLES SON: 1. PROGRAMACION EN C++  2. PROGRAMACION EN PYTHON  3. PROGRAMACION EN JAVA");

        //BufferedReader t = new BufferedReader ( new InputStreamReader(System.in));

        try {
            int p=0;
            int progC= 1 ,progP= 2, progJ= 3;

            while(p= 0; p<=1000; ){
                System.out.println("\nLOS CURSOS DISPONIBLES SON: 1. PROGRAMACION EN C++  2. PROGRAMACION EN PYTHON  3. PROGRAMACION EN JAVA");
                System.out.print("\nINGRESE NUMERO DE MATERIA SELECCIONADA: ");
                String MATERIA=t.readLine();

                if (p <= 100) {
                    System.out.print("\nINGRESE NOMBRE COMPLETO: ");
                    String NOMBRE=t.readLine();

                    int CEDULA;
                    System.out.print("\nINGRESE SU CEDULA (sin guiones ni espacios): ");
                    CEDULA = Integer.parseInt(t.readLine());

                    in                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 t TEL;
                    System.out.print(" \nINGRESE SU TELEFONO(sin guiones ni espacios): ");
                    TEL = Integer.parseInt(t.readLine());
                }
                p++;
            }

        } catch (Exception e) {
        }



    }
}
