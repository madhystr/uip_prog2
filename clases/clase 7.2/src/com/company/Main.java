package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	int contador[] = {17, 20, 06, 29, 16};
        Set<Integer> conjunto = new HashSet<Integer>(); // para conjunto ordenado seria SortedSet conjunto = new TreeSert
        try{
            for (int i = 0; i < 5; i++){
                conjunto.add(contador[i]);
            }
            System.out.println(conjunto);
        }finally {

        }
//Iterator it= conjunto. ieterator();
        //while (it.hasNet())
        //Objet elemento= it.net();
        //System.out.println(elemento.toString());
    }
}
