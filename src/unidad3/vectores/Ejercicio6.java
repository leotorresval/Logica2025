package unidad3.vectores;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de nombres:");
        int c = teclado.nextInt();
        String[] n = new String[c];
        for (int i = 0; i < c; i++) {
            System.out.print("Nombre[" + i + "]: ");
            n[i] = teclado.next();
        }
        System.out.println("Contenido del vector");
        System.out.println("Nombres con mas de 4 letras");
        for (int i = 0; i < n.length; i++) {
            if (n[i].length() > 4) {
                System.out.println("Nombre[" + i + "]: " + n[i]);
            }
        }
    }
}
