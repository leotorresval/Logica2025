
package unidad1;
import java.util.Scanner;
public class Ejercicio3 {
    //DADO UN NUMERO, DETERMINAR SI ES POSITIVO 
    //O NEGATIVO
    public static void main (String []args){
        Scanner tecla = new Scanner (System.in);
        double num;
        System.out.println("INGRESE UN NUMERO");
        num = tecla.nextDouble();
        if(num<0){
            System.out.println("EL NUMERO ES NEGATIVO");
        }else if (num>0){
            System.out.println("EL NUMERO ES POSITIVO");
        } else{
            System.out.println("EL NUMERO CERO NO TIENE SIGNO");
        }
        
    }
}
