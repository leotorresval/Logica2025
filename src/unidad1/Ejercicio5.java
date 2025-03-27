package unidad1;

import java.util.Scanner;

public class Ejercicio5 {
    //DADA UNA EDAD INGRESADA POR TECLADO 
    //INDIQUE SI ES MAYOR DE EDAD CONSIDERANDO
    //QUE LA MAYORIA DE EDAD COMPRENDE
    //EL RANGO ENTRE 18 Y 65
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        System.out.println("INGRESE SU EDAD");
        edad = teclado.nextInt();
        if(edad>=18 && edad<=65){
            System.out.println("EDAD CORRECTA");
        }else if (edad<18){
            System.out.println("MENOR DE EDAD");
        }else {
            System.out.println("TERCERCA EDAD");
        }
        System.out.println("EDAD: "+ edad+ " años.");
    }
}
