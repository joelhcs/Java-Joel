package exercicios_semestre1;
import java.util.Scanner;
public class Uni4Ex18 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Dia do vencimento:");
    int vencimento = sc.nextInt();
    System.out.println("Dia do pagamento:");
    int diaPagamento = sc.nextInt();
    System.out.println("Valor da prestação:");
    double valorPrestacao = sc.nextDouble();
    double valorFinal;
    if (diaPagamento <= vencimento) {
        valorFinal = valorPrestacao * 90/100;
        System.out.printf("O pagamento está em dia. O valor da prestação = R$%.2f\n", valorFinal);
    } else if (vencimento + 5 >= diaPagamento) {
        valorFinal = valorPrestacao;
        System.out.printf("O pagamento está em atraso até 5 dias. O valor da prestação = R$%.2f\n", valorFinal);
    } else {
        valorFinal = valorPrestacao * (1+0.02*(diaPagamento-vencimento));
        System.out.printf("O pagamento está atrasado. Multa de 2%% por dia de atraso. Valor da prestação = R$%.2f\n", valorFinal);

    }
    }
        

}

