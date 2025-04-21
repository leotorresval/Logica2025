/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ape3;

import java.util.Scanner;

/**
 *
 * @author leoto
 */
public class Ejercicio4_while_optimizado {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un valor:");
        int numero = teclado.nextInt();
        int i = 1, suma = 0, contador = 0;
        int constante = 15;
        contador=numero/15;
        while(i<=contador){
            System.out.println(i);
            suma+=(constante*i);
            i++;
        }
        System.out.println("Sumatoria: "+suma);
        System.out.println("Contador: "+contador);
    }
}
