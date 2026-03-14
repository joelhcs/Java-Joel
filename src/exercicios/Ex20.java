package exercicios;

import java.util.Scanner;

public class Ex20 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Quantos litros de gasolina foram utilizados?");
    int gasolina = scan.nextInt();
    System.out.println("Quantos litros de etanol foram utilizados?");
    int etanol = scan.nextInt();
    Double precoGasolina = gasolina*5.75;
    Double precoEtanol = etanol*4.29;
    Double valorTotal = precoGasolina + precoEtanol;
    System.out.println("Valor gasolina: R$" + precoGasolina + "\nValor etanol: R$" + precoEtanol + "\nValor total: R$" + valorTotal);
}
}
