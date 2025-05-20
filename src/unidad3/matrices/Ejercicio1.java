package unidad3.matrices;

public class Ejercicio1 {

    public static void main(String[] args) {
        //DEFINICION DE LA MATRIZ
        int matriz[][] = new int[2][3];
        //MANIPULACION
        //ASIGNAR VALORES
        matriz[0][0] = 25;
        matriz[2][1] = 55;
        //RECUPERAR VALORES
        int a= matriz[2][1];
        System.out.println(a);
        System.out.println(matriz[0][0]);
        //DIMENSION-LONGITUD
        int fila= matriz.length;//filas
        int columna= matriz[1].length;//columnas
                
    }

}
