package ape2;

import java.util.Scanner;

public class Ejercicio9_1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String palabra = teclado.next();
        char letra = palabra.charAt(0);
        if ((letra >= 65 && letra <= 90) && letra ==209) {
            System.out.println("Es mayuscula");
        } else {
            if ((letra >= 97 && letra <= 122) || letra==241) {
                System.out.println("Es minuscula");
            } else {
                System.out.println("No es una letra");
            }

        }
    }
}
