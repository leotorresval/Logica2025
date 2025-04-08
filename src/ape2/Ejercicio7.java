package ape2;

import java.util.Scanner;


public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la edad");
        int edad = teclado.nextInt();
        System.out.println("Tiene licencia? (true/false)");
        boolean licencia = teclado.nextBoolean();
        if(edad>=18 && licencia){
            System.out.println("Apto para conducir");
        }else{
            System.out.println("No cumple las condiciones "
                    + "para conducir");
        }
    }
}
