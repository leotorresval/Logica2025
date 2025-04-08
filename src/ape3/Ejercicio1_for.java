package ape3;

import java.util.Scanner;

public class Ejercicio1_for {
    public static void main(String[] args) {
        //Ingrese un número por teclado 
        //y genere su tabla de multiplicar del 1 al 12.
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int n = teclado.nextInt();
        for (int i = 1; i <= 12; i++) {
            int t = i*n;
            System.out.println(i+"x"+n+"="+t);
        }
    }
}












