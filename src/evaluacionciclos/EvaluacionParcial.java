
package evaluacionciclos;

import java.util.Random;

public class EvaluacionParcial {
    public static void main(String[] args) {
        int a,suma=0,r=0,acumulacion=0;
        Random aleatorio = new Random();
        for (int i = 1; i <= 10; i++) {
            int randomica = aleatorio.nextInt(10, 1001);
            for (int j = 1; j <=randomica; j++) {
                suma+=j;
            }
            if(suma%2==0){
                acumulacion+=suma;
            }
            else{
                i--;
            }
            r++;
            System.out.println(r+"  ->"+randomica+" => "+suma);
            suma=0;
        }
        
        System.out.println(r);
        System.out.println(acumulacion);
        System.out.println(acumulacion/10);
        
    }
 
}
