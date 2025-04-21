package ape3;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);
        int valor = aleatorio.nextInt(10)+1;
        System.out.println(valor);
        int i=1;
        do{
            System.out.println("Ingrese un número");
            int numero =teclado.nextInt();
            if(valor==numero){
                System.out.println("Felicidades, adivinaste el número");
                break;
            }else{
                System.out.println("Número incorrecto");
                System.out.println("Quedan "+(3-i)+" intentos");
            }
            i++;
        }while(i<=3);
        System.out.println("El número era: "+valor);
        
    }
}
