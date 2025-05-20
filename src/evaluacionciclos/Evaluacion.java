package evaluacionciclos;

import java.util.Random;
import java.util.Scanner;

public class Evaluacion {
    public static void main(String[] args) {
        Random a = new Random();
        Scanner teclado = new Scanner(System.in);
        String respuesta="";
        int valor, cMultiplo,cNoMultiplo,total;
        double pMultiplo,pNoMultiplo,aMultiplo,aNoMultiplo;
        aMultiplo=aNoMultiplo=cNoMultiplo=cMultiplo=0;
        total=0;
        pMultiplo=pNoMultiplo=0;
        do{
            valor = a.nextInt(1,101);
            System.out.println("Valor generado: "+valor);
            if(valor%21==0){
                cMultiplo++;
                aMultiplo=aMultiplo+valor;
            }else{
                cNoMultiplo++;
                aNoMultiplo=aNoMultiplo+valor;
            }
            System.out.print("Desea continuar [si/no]");
            respuesta=teclado.next();
        }while(respuesta.equals("si"));
        pMultiplo=aMultiplo/cMultiplo;
        pNoMultiplo=aNoMultiplo/cNoMultiplo;
        total = cMultiplo+cNoMultiplo;
        System.out.println("Total: "+total);
        System.out.println("# Multiplos "+cMultiplo);
        System.out.println("# No multiplos "+cNoMultiplo);
        System.out.println("P. multiplos "+pMultiplo);
        System.out.println("P. no multiplos "+pNoMultiplo);
        
    }
}
