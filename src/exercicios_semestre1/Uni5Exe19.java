package exercicios_semestre1;
import java.util.Scanner;
public class Uni5Exe19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valorCompra = 0, valorAPagar = 0, valorFinalDoDia = 0;

        System.out.println("Valor da compra: ");
        valorCompra = sc.nextDouble();

        while (valorCompra != 0) {
            
            if (valorCompra > 500) {
                
                valorAPagar = valorCompra * 0.8;

            } else {

                valorAPagar = valorCompra * 0.85;

            }

            System.out.printf("Valor a pagar: R$%.2f" , valorAPagar);

            valorFinalDoDia += valorAPagar;

            System.out.println("\nValor da compra: ");
            valorCompra = sc.nextDouble();
        }

        System.out.printf("O valor total recebido foi de R$%.2f" , valorFinalDoDia);

    }
}