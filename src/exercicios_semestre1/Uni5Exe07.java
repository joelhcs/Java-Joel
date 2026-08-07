package exercicios_semestre1;
import java.util.Scanner;
public class Uni5Exe07 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite quantos números você quer escrever: ");
        int n = sc.nextInt();
        double maior, menor;

        System.out.println("Digite o 1° número: ");
        double primeiro = sc.nextDouble();
        maior = primeiro;
        menor = primeiro;

        for(int a = 2; a <= n; a++) {

            System.out.println("Digite o " + a + "° número: ");
            double numero = sc.nextDouble();

                if (numero > maior) {
                    maior = numero;
                } 
                    
                if (numero < menor) {
                    menor = numero;    
                }

        }
        
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

    }
}