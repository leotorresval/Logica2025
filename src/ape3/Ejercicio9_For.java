package ape3;

import java.util.Scanner;

public class Ejercicio9_For {
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        System.out.println("Cuantos empleados desea ver su sueldo");
        int nempleados=teclado.nextInt();
        int i;
        for (i=1;i<=nempleados;i++){
            System.out.println("Empleado"+i);
            System.out.println("Desea aumentar un empleado");
            String rep=teclado.next();
            if (rep.equalsIgnoreCase("si")){
                nempleados=nempleados+1;
            }
        }
        System.out.println("Usted vio el sueldo de "+nempleados+" empleados");
    }
}
