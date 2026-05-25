package exercicios;
import java.util.Scanner;
public class Uni5Exe01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int a = 1; a <=20; a++) {

            System.out.println("Digite o " + a +  "° número: ");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {

                System.out.println("É par");
                
            } else {

                System.out.println("É ímpar");
            }
        }
    }
}
