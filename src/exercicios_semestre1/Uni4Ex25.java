package exercicios_semestre1;
import java.util.Scanner;
public class Uni4Ex25 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escolha o primeiro valor:");
    int valor1 = sc.nextInt();
    System.out.println("Escolha o segundo valor:");
    int valor2 = sc.nextInt();
    System.out.println("Escolha uma opção (1 a 4):");
    int opcao = sc.nextInt();
    int soma = valor1 + valor2;
    int diferenca = valor1 - valor2;
    int produto = valor1 * valor2;
    switch (opcao) {
        case 1:
            System.out.println(soma);
            break;
        case 2:
            System.out.println(diferenca);
            break;
        case 3:
            System.out.println(produto);
            break;
        case 4:
            if (valor2 != 0) {
                System.out.println(valor1 / valor2);
            } else {
                System.out.println("O denominador não pode ser zero");
            }
                break;
                    default:
                        System.out.println("Essa opção é inválida");
            }
    }
}