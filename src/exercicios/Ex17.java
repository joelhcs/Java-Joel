package exercicios;
import java.util.Scanner;

public class Ex17 {
public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    System.out.println("Quantas camisetas o cliente comprou?");
    Double camisetas = teclado.nextDouble();
    Double valorTotal = camisetas * 35;
    Double desconto = (valorTotal/10) ;
    Double valorFinal = valorTotal - desconto;
    System.out.println("Valor total: R$" + valorTotal + "\nDesconto aplicado: R$" + desconto + "\nValor final: R$" + valorFinal);

}
}
