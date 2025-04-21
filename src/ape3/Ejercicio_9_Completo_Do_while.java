package ape3;

import java.util.Scanner;

public class Ejercicio_9_Completo_Do_while {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre, respuesta = "";
        int horasTrabajadas, contador = 0;
        double precioHora,acumulador=0;
        do {
            System.out.print("Ingrese el nombre: ");
            nombre = teclado.next();
            System.out.print("Ingrese el precio por hora ");
            precioHora = teclado.nextDouble();
            System.out.print("Numero de horas trabajadas ");
            horasTrabajadas = teclado.nextInt();
            double pagar = precioHora * horasTrabajadas;
            System.out.println(nombre + " gana "
                    + pagar + " dolares");
            System.out.println("Desea calcular otro sueldo [si/no]");
            respuesta = teclado.next();
            contador++;
            acumulador= acumulador+pagar;
        } while (respuesta.equals("si"));
        System.out.println("Numero de empleados "
                + "calculados el sueldo: " + contador);
        System.out.println("El valor total a pagar"
                + "por la empresa es: "+acumulador);
    }
}
