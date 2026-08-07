package exercicios_semestre1;
import java.util.Scanner;
public class Uni6Exe06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de números dentro do vetor:");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        System.out.println("Comece a digitar os valores: ");

        for(int x = 0; x < n; x++) {
            vetor[x] = sc.nextDouble();
        }

        System.out.println("Digite um valor real para saber se ele está dentro do vetor: ");
        double valor = sc.nextDouble();
        boolean encontrado = false;

        for(int i = 0; i < n; i++) {
            if (vetor[i] == valor) {
                encontrado = true;
                break;
            }
            }

        if (encontrado) {
            System.out.println("Está cadastrado");
        } else {
            System.out.println("Não está cadastrado");
        }
    }
}