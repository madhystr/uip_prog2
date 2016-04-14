package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int calificacion=70;
        char nota;
        n = new Scanner(System.in);
        String opcion='s';

        do {
            System.out.print("Ingrese la calificacion: ");
            calificacion = n.nextInt();

            while (calificacion < 0 || calificacion > 100) {
                System.out.println("La nota es invalida.");
                System.out.print("\nIngrese nuevamente la calificacion: ");
                calificacion = n.nextInt();
            }
        /*do {
            System.out.println("La nota es negativa.");
            System.out.print("\n Ingrese la calificacion: ");
            calificacion = n.nextInt();
        } while (calificacion<0);*/
            if (calificacion > 90) {
                nota = 'A';
            } else if (calificacion > 80) {
                nota = 'B';
            } else if (calificacion > 70) {
                nota = 'C';
            } else {
                nota = 'F';
                if (calificacion == 70) {
                    System.out.println("Casi lo logras!");
                } else {
                    System.out.println("Te falto!");
                }
            }

            System.out.println("Tu nota final es " + nota);

            System.out.print("Desea continuar (S/N): ");

        } while (opcion.equals("s") || opcion.equals("S");
    }
}

}
}
