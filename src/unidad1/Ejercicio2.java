package unidad1;
import java.util.Scanner;
public class Ejercicio2 {
   //Dado el radio de un circulo
   //Calcule su area
    public static void main(String[]args){
        Scanner circulo = new Scanner (System.in);
        double radio,resul;
        System.out.println("Ingrese el radio de un circulo");
        radio= circulo.nextDouble();
        resul= Math.PI*Math.pow(radio,2);
        System.out.println("El area es "+ resul);
        
    }
}
