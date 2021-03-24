package com.company;

// tot aixó es pel yaml

import java.util.*;



public class Main {
    static Llibreta llibreta=new Llibreta();
    static Scanner scan= new Scanner(System.in);

    public static void main(String[] args) {
        Main.llibreta.cargaYaml();
        while (true){


            for (Pagina i: llibreta.pagina){
                System.out.println(i.titol);
                System.out.println(i.tipus);
                System.out.println(i.nom);
                System.out.println(i.cognom);
                System.out.println(i.id);
                for (String h: i.linia){
                    System.out.println(h);
                }

            }

        }




    }

}
