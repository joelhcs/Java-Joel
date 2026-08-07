package exercicios_semestre1;
import java.util.Scanner;
public class Uni5Exe08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos números você quer escrever: ");
        int n = sc.nextInt();

        int numeroMenor = 0, mediaNumerosPositivos = 0, somaNumerosPositivos = 0, qtdPositivos = 0;

        for(int a = 1; a <= n; a++) {

            System.out.println("Digite o " + a + "° número: ");
            int numero = sc.nextInt();

            if (numero > 0) {
                somaNumerosPositivos += numero;
                ++qtdPositivos;
            } else if (numero < numeroMenor) {
                numeroMenor = numero;
            }
        }

        mediaNumerosPositivos = somaNumerosPositivos / qtdPositivos;

        System.out.println("Menor valor negativo: " + numeroMenor);
        System.out.println("Média dos números positivos: " + mediaNumerosPositivos);
    }
}