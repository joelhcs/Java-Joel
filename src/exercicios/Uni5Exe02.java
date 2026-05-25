package exercicios;

public class Uni5Exe02 {
    public static void main(String[] args) {
        
        int pares = 0, impares = 0;
    
        for(int a = 1; a <= 100; a++) {

            if (a % 2 == 0) {
                pares += a;
            } else {
                impares += a;
            }
        }

        System.out.println("Soma dos números pares: " + pares);
        System.out.println("Soma dos números ímpares: " + impares);
    }
}