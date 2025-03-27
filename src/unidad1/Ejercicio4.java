/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad1;

import java.util.Scanner;

/**
 *
 * @author leoto
 */
public class Ejercicio4 {
    //APLICAR DESCUENTO A UN PRODUCTO EN BASE 
    //A UNA CONDICION
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto");
        String nombre = teclado.next();
        System.out.println("Ingrese el precio");
        double precio= teclado.nextDouble();
        System.out.println("Tiene descuento? [si/no]");
        String respuesta = teclado.next();
        /*if(respuesta.equals("si")
                || respuesta.equals("SI" )
                || respuesta.equals("Si" )
                || respuesta.equals("sI" )){*/
        if(respuesta.equalsIgnoreCase("si")){
            System.out.println("Cual es el porcentaje de descuento:");
            double descuento = teclado.nextDouble();
            double vFinal= precio - (precio * descuento)/100;
            System.out.println("Valor a pagar: "+vFinal);
        }else{
            System.out.println("Valor a pagar: "+precio);
        }
    }
    
    
}
