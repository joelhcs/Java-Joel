package exercicios_semestre1;
import java.util.Scanner;
public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor inicial (N): ");
        int n = sc.nextInt();

        System.out.println("Digite o decremento (K): ");
        int k = sc.nextInt();

        System.out.println("Digite o tamanho da mochila (M): ");
        int m = sc.nextInt();

        int atual = n;
        int somaDentro = 0, somaFora = 0;

        String dentro = "", fora = "";

        System.out.println("\nElementos da sequência:");
        int temp = n;
        
        while (temp > 0) {
            System.out.print(temp + " ");
            temp -= k;
        }

        while (atual > 0) {
            
            if (somaDentro + atual <= m) {
                dentro += atual + " ";
                somaDentro += atual;
            } else {
                somaFora += atual;
                fora += atual + " ";
            }

            atual -= k;
        }

        System.out.println("\nElementos que entraram: " + dentro);
        System.out.println("Elementos que ficaram fora: " + fora);
        System.out.println("Soma dentro: " + somaDentro);
        System.out.println("Soma fora: " + somaFora);

    }
}