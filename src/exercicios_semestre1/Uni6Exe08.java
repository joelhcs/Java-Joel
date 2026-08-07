package exercicios_semestre1;
import java.util.Scanner;

public class Uni6Exe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.println("Digite a quantidade de números dentro do vetor (máximo 20):");
            n = sc.nextInt();

        } while (n < 1 || n > 20);

        double[] vetor = new double[n];

        System.out.println("Preencha o vetor:");

        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {

            boolean repetido = false;

            for (int j = 0; j < i; j++) {

                if (vetor[i] == vetor[j]) {
                    repetido = true;
                }
            }

            if (!repetido) {

                int contador = 0;

                for (int j = 0; j < n; j++) {

                    if (vetor[i] == vetor[j]) {
                        contador++;
                    }
                }

                System.out.println("O número " + vetor[i] + " aparece " + contador + " vez(es).");
            }
        }
    }
}