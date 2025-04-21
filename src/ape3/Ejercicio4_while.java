package ape3;

import java.util.Scanner;

public class Ejercicio4_while {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un valor:");
        int numero = teclado.nextInt();
        int i = 1, suma = 0, contador = 0;
        while (i <= numero) {
            System.out.println(i);
            if (i % 3 == 0 && i % 5 == 0) {
                suma += i;
                contador++;
            }
            i++;
        }
        System.out.println("Sumatoria: " + suma);
        System.out.println("Contador: " + contador);
    }
}
