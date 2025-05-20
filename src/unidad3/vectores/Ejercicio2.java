package unidad3.vectores;

import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        int edad[] = new int[45];
        Random a = new Random();
        double acumulador=0;
        for (int i = 0; i < edad.length; i++) {
            edad[i]=a.nextInt(18,24);
            acumulador+=edad[i];
            System.out.println("Edad["+i+"]"+edad[i]);
        }
        double promedio = acumulador/edad.length;
        System.out.println("Promedio: "+promedio);
    }
}
