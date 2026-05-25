package exercicios;
import java.util.Scanner;
public class Uni5Exe34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;
        int contasEncerradas = 0;

        do {
            System.out.println("\n1 - Encerrar conta");
            System.out.println("2 - Ver número de contas encerradas");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Nome do hóspede: ");
                    String nome = sc.next();

                    System.out.print("Número de diárias: ");
                    int diarias = sc.nextInt();

                    double taxa;

                    if (diarias < 15) {
                        taxa = 7.50;
                    } else if (diarias == 15) {
                        taxa = 6.50;
                    } else {
                        taxa = 5.00;
                    }

                    double total = (50 + taxa) * diarias;

                    System.out.printf("Hóspede: %s\nTotal a pagar: R$ %.2f\n", nome, total);

                    contasEncerradas++;
                    break;

                case 2:
                    System.out.println("Contas encerradas: " + contasEncerradas);
                    break;

                case 3:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 3);
    }
}