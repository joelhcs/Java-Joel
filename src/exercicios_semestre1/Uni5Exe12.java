package exercicios_semestre1;
import java.util.Scanner;
public class Uni5Exe12 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de linhas a serem impressas: ");
        int n = sc.nextInt();
        int numero = 1;

        for(int linha = 1; linha <=n; linha++) {

            for(int i = 1; i <= linha ; i++) {

                System.out.print(numero + " ");
                numero++;
            }

            System.out.println();
        }
    }
}