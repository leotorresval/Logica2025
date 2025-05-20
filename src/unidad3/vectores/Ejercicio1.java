package unidad3.vectores;

public class Ejercicio1 {
    public static void main(String[] args) {
        //DEFINICION
        int edad [] = new int[3];
        float estatura[] = new float[3];
        String [] nombre = new String[3];
        //MANIPULAR
        //LLENARLO
        edad[0]=5;
        edad[1] =15;
        edad[2] =25;
        //OBTENER VALORES
        System.out.println("Valor[0]: "+edad[0]);
        int suma = edad[0]+edad[1]+edad[2];
        System.out.println("Sumatoria: "+suma);
    }
}
