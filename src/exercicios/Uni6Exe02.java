package exercicios;
import java.util.Scanner;
public class Uni6Exe02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[] numero = new double[12];
        double total = 0;
        for(int i = 0; i < numero.length; i++) {
            numero[i] = sc.nextDouble();
            total += numero[i];
        }

        double media = total / numero.length;
        System.out.println("Números acima da média:");
        for(int i = 0; i < numero.length; i++) {
            if (numero[i] > media) {
                System.out.println(numero[i]);
            }
        }
    }
}