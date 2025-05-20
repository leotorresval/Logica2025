package unidad3.matrices;

import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        int []matriz[] = new int[500][100];
        Random a = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]=a.nextInt(2);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("\033[0;32m");
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
