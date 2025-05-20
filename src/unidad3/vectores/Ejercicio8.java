package unidad3.vectores;

public class Ejercicio8 {

    public static void main(String[] args) {
        String[] nombres = Ejercicio7.retornaVectorNombres();
        for (int i = 0; i < nombres.length; i++) {
            String prueba = nombres[i];
            int ultimo = prueba.length();
            char letra = prueba.charAt(ultimo-1);
            if (letra == 'a' || letra == 'A') {
                System.out.println(prueba);
            }
        }
    }
}
