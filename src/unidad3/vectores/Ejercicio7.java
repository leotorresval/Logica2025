package unidad3.vectores;

public class Ejercicio7 {
    public static String[] retornaVectorNombres() {
        String [] n = new String [10];
        n[0]="Sebastian";
        n[1]="Jaime";
        n[2]="Anderson";
        n[3]="Fernanda";
        n[4]="Rebeca";
        n[5]="Patricio";
        n[6]="David";
        n[7]="Alvaro";
        n[8]="Rafael";
        n[9]="Elizabeth";
        for (int i = 0; i < n.length; i++) {
            System.out.println("V["+i+"]"+n[i]);
        }
        
        return n;
    }
}
