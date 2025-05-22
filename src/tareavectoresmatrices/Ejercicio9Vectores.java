package tareavectoresmatrices;

public class Ejercicio9Vectores {

    public static void main(String[] args) {
        String v[] = {"gato", "PERRO", "SOL","MEDIO",
             "SOL", "PERRO", "GATO"};
        boolean cumple = true;
        for (int i = 0; i < v.length; i++) {
            String comienzo = v[i];
            String fin = v[v.length - 1 - i];
            if (comienzo.equals(fin)) {
            } else {
                cumple = false;
                break;
            }
        }
        if (cumple) {
            System.out.println("Es capicua");
        } else {
            System.out.println("No es capicua");
        }
    }
}
