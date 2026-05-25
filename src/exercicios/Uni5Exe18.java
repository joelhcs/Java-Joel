package exercicios;
import java.util.Scanner;
public class Uni5Exe18 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int canal = 0; 
        double canal4 = 0, canal5 = 0, canal9 = 0, canal12 = 0, qtdTotalPessoas = 0, qtdPessoas = 0, percentual4, percentual5, percentual9, percentual12;
        
        System.out.println("Canal: ");
        canal = sc.nextInt();

        while (canal != 0) {
            System.out.println("Pessoas assistindo: ");
            qtdPessoas = sc.nextDouble();

            switch (canal) {
                case 4 -> canal4 += qtdPessoas;
                case 5 -> canal5 += qtdPessoas;
                case 9 -> canal9 += qtdPessoas;
                case 12 -> canal12 += qtdPessoas;
            }
            qtdTotalPessoas += qtdPessoas;

            System.out.println("Canal: ");
            canal = sc.nextInt();
        }

        percentual4 = canal4 / qtdTotalPessoas * 100;
        percentual5 = canal5 / qtdTotalPessoas * 100;
        percentual9 = canal9 / qtdTotalPessoas * 100;
        percentual12 = canal12 / qtdTotalPessoas * 100;

        System.out.printf("Percentual de audiência do canal 4: %.2f%%" , percentual4);
        System.out.printf("\nPercentual de audiência do canal 5: %.2f%%" , percentual5);
        System.out.printf("\nPercentual de audiência do canal 9: %.2f%%" , percentual9);
        System.out.printf("\nPercentual de audiência do canal 12: %.2f%% " , percentual12);

    }
}