package talleres;

import java.util.Scanner;

public class condicional1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int val1,val2;
        System.out.println("Ingrese un numero");
        val1=teclado.nextInt();
        System.out.println("Ingrese un numero");
        val2=teclado.nextInt();
        int suma=val1+val2;
        System.out.println("Suma:" +suma);
        if(suma>100){
            System.out.println("Suma alta");
        }
        if(suma>=50 && suma<=100){
            System.out.println("Suma media");
        }
        if(suma<50){
            System.out.println("Suma baja");
        }
    }
}
