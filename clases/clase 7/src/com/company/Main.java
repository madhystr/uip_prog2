package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("ejecutemos al sospechoso");
            System.out.println("sospechoso 1");
            int n = Integer.parseInt("M");
            System.out.println("sospechoso 2");
            System.out.println("sospechoso 3");
        } catch (Exception e) {
            System.out.println("Capturamos al sospechoso");
        } finally {
            System.out.println("capturamos o no al sospechoso");
        }

    }
}
