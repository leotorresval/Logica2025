package tareavectoresmatrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7Matrices {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random rd = new Random();
        int mayor = 0, menor = 0;
        int m[][] = new int[3][4];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = rd.nextInt(-100, 100);
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
        mayor=m[0][0];
        int pmayori=0,pmayorj=0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if(m[i][j]>mayor){
                    mayor=m[i][j];
                    pmayori=i;
                    pmayorj=j;
                }
            }
        }
        System.out.println("v["+pmayori+"]["
                +pmayorj+"]="+mayor);

    }
}
