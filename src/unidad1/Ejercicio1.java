package unidad1;

import java.util.Scanner;

public class Ejercicio1 {
    //SOLICITE 3 NUMEROS POR TECLADO 
    //E IMPRIMA EL PROMEDIO 
    //INPUT
    //PROCESS
    //OUTPUT
    public static void main(String[] args) {
        Scanner pc = new Scanner (System.in);
        double num1;
        double num2;
        double num3;
        double promedio;
        System.out.println("ingrese el primer numero : ");
        num1 = pc.nextDouble();
        System.out.println("El segundo valor : ");
        num2 = pc.nextDouble();
        System.out.println("El tercer valor : ");
        num3 = pc.nextDouble();
        promedio = (num1 + num2+ num3)/3;
        System.out.println("El promedio es : " + promedio);
        double a = Math.round(promedio*100)/100d;
        System.out.println(a);
    }
}
