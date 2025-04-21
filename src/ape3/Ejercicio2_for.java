package ape3;

import java.util.Scanner;

public class Ejercicio2_for {

    public static void main(String[] args) {
        int suma = 0, producto = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = teclado.nextInt();
        System.out.println(numero+" primeros numeros "
                + "multiplos de 3");
        numero = numero * 3;
        for (int i = 3; i <= numero; i += 3) {
            System.out.print(" "+i);
            suma = suma + i;
            producto *= i;
        }
        System.out.println("");
        System.out.println("Sumatoria: " + suma);
        System.out.println("Producto+: " + producto);
    }
}
