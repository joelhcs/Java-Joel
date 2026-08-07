package exercicios_semestre1;

import java.util.Scanner;

public class Ex02 {
public static void main(String[] args) {
    
    final double percentualDesconto = 12;
    final double porcentagem = 100;

    System.out.println("Informe o valor do sapato:");

    Scanner teclado = new Scanner(System.in); {
        double precoSapato = teclado.nextDouble();

        double valorDesconto = precoSapato * percentualDesconto / porcentagem;

        double valorFinalSapato = precoSapato - valorDesconto;

        System.out.println("O valor do desconto é de R$ " + valorDesconto);
        System.out.println("O preço do par de sapatos com desconto é R$ " + valorFinalSapato);
    }




}
}
