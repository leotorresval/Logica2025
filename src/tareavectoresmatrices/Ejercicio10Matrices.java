package tareavectoresmatrices;

public class Ejercicio10Matrices {
    public static void main(String[] args) {
        String p[][]=EjercicioSoporteMatriz.soporte10();
        ejercicio10(p);        
    }
    
    public static void ejercicio10(String [][] q){
        for (int i = 0; i < q.length; i++) {
            for (int j = 0; j < q[i].length; j++) {
                System.out.print(q[i][j]+" ");
            }
            System.out.println("");
        }
        int fila=q.length;
        int columna=q[0].length;
        int n[][]=new int[fila][columna];
    }
}
