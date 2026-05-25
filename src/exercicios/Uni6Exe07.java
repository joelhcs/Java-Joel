package exercicios;
import java.util.Scanner;
public class Uni6Exe07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;

        do {
        System.out.println("Digite a quantidade de números dentro do vetor(no máximo 20):");
        n = sc.nextInt();

        } while (n > 20 || n < 1);

        int[] vetor = new int[n];

        for(int i = 0; i < n; i++) {
            
            boolean repetido;
            
            do {
            
                repetido = false;
                System.out.println("Digite o " + (i+1) + "° número:");
                vetor[i] = sc.nextInt();

                for(int j = 0; j < i; j++) {
                    
                    if (vetor[i] == vetor[j]) {
                        System.out.println("Valor repetido.");
                        repetido = true;
                    }
                }
            } while (repetido);
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - 1 - i; j++) {
                if (vetor[j] > vetor[j +1]) {
                    int troca = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = troca;
                }
            }
        }

        System.out.println("Vetor ordenado:");
         
        for(int i = 0; i < n; i++) {
            System.out.println(vetor[i]);
        }
    }
}