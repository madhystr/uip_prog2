package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List a1 = new ArrayList();
       try {
           a1.add("jaun");
           a1.add(1, "maria");
           a1.add(1,"mario");
           a1.add(3,"josefina");
           a1.remove(3);
           System.out.println("el indice de Mario es" + a1.indexOf("mario"));
       }catch (IndexOutOfBoundsException e) {
           System.out.println("te pasaste del rango de la lista");

       }finally {
           System.out.println("elemento de mi lista");

           System.out.println("\t" +a1);
       }






    }
}
