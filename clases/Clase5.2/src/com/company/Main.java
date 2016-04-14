package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner x;
    public static void main(String[] args) {

        x = new Scanner(System.in);
        System.out.println("TIBUNAL ELECTORAL");
        System.out.print("Edad: ");
        int edad = x.nextInt();

        if (edad > 18){
            System.out.println("puedes votar.");
        }else if (edad == 18){
            System.out.println("puedes votar si tienes tu cedula.");
        }else {
            System.out.println("busca a tu acudiente.");
        }







    }
}
