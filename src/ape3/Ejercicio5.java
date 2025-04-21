package ape3;

public class Ejercicio5 {

    public static void main(String[] args) {
        int a = 10, contador = 0, contadorPrimos = 0;
        int rango = 15;
        //DESDE AQUI
        for (int j = 2; j <= rango; j++) {
            for (int i = 2; i <= j; i++) {
                if (j % i == 0) {
                    contador++;
                }
            }
            if (contador == 1) {
                contadorPrimos++;
                System.out.println(j+" Si es primo");
            }
            contador = 0;
        }
        System.out.println("Cantidad de primos: " + contadorPrimos);
        //HASTA ACA

    }
}
