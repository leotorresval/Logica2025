package ape3;

import java.util.Random;

public class Ejercicio7_do_while {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        for (int i = 0; i < 5; i++) {
            int valor = aleatorio.nextInt(6)+1;
            System.out.println(valor);

        }

    }
}
