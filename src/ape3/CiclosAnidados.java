package ape3;

public class CiclosAnidados {

    public static void main(String[] args) {
        for (int j = 0; j < 2; j++) {
            System.out.print(j+"->");
            for (int i = 0; i < 3; i++) {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}
