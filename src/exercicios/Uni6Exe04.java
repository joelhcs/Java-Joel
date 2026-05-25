package exercicios;
import java.util.Scanner;
public class Uni6Exe04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[10];

        System.out.println("Digite os números do primeiro vetor: ");

        for(int i = 0; i < vetor1.length; i++) {
            vetor1[i] = sc.nextInt();
        }

        System.out.println("Digite os números do segundo vetor: ");

        for(int i = 0; i < vetor2.length; i++) {
            vetor2[i] = sc.nextInt();
        }

        for(int i = 0; i < vetor3.length; i++) {
            vetor3[i] = vetor1[i] + vetor2[i];
        }

        System.out.println("Vetor 1: ");

        for(int i = 0; i < vetor1.length; i++) {
            System.out.println(vetor1[i]);
        }

        System.out.println("Vetor 2: ");

        for(int i = 0; i < vetor2.length; i++) {
            System.out.println(vetor2[i]);
        }

        System.out.println("Vetor 3: ");

        for(int i = 0; i < vetor3.length; i++) {
            System.out.println(vetor3[i]);
        }
    }
}