package exercicios_semestre1;
import java.util.Scanner;
public class Uni5Exe31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número positivo: ");
        int numero = sc.nextInt();
        int divisor = 2;

        while (numero > 1) {

            if (numero % divisor == 0) {
                System.out.println(numero + "\t" + divisor);
                numero /= divisor;
            } else {
                divisor++;
            }
            
        }

        System.out.println("1");
    }
}