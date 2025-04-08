package ape3;

import java.util.Scanner;

public class Ejercicio1_while {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int n = teclado.nextInt();
        int i = 1;
        while (i <= 12) {
            int t = i*n;
            System.out.println(i+"x"+n+"="+t);
            i++;
        }
        

    }
}
