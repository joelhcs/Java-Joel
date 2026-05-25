package exercicios;
import java.util.Scanner;
public class Uni5Exe06 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double alturaTotal = 0;

        for(int n = 1; n <= 20; n++) {

            System.out.println("Altura da pessoa " + n + ": ");
            double altura = sc.nextDouble();

            alturaTotal += altura;

        }

        double media = alturaTotal / 20;
        System.out.printf("A média das alturas é: %.2f" , media);
    }
}