package com.hedima.presentacion;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");

        //Asignación de variables

        int a = 10;
//        Ctrol + barrar del teclado numérico comenta
//        a= a+5;
        a +=5; // es lo mismo que antes
        System.out.println("La suma es: " + a);

        int b = 10;
//        b =b -5;
        b -=5;
        System.out.println("La resta es: "+ b);

        //Resto

        int c = 10;
        System.out.println("El resto es: "+ c%3);

        //Incremento

        int d = 10;
//        d+=1;
        d++;
        System.out.println("El incremento es: " + d);

        //Pre-incremento y post-incremento

        int e = 10;
        int f = 5;
        e+=f++;

        System.out.println("El pre-incremento es: " + e);
        System.out.println("El post-incremento es: " + f);

        char letra = 'a';
        String nombre = "Juan";
        String apellido = "Perez";
        System.out.println(nombre+ " "+apellido);
        System.out.println(nombre.concat(" "+apellido));



    }
}