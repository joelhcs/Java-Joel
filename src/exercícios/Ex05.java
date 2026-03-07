package exercícios;

import java.util.Scanner;

public class Ex05 {
public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    final double custoFrango = 3.5*2+4;
    System.out.println("Quantos frangos tem na sua granja? ");
    double frango = teclado.nextDouble();
    double gastoTotal = frango * custoFrango;
    System.out.println("O custo total da sua granja para marcar todos os frangos é de R$" + gastoTotal);
    



}
}
