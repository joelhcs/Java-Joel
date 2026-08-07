package exercicios_semestre1;

import java.util.Scanner;

public class Ex03 {
public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in); 
    System.out.println("Insira o preço do litro de gasolina: ");
    double litro = teclado.nextDouble();
    System.out.println("Insira o valor do pagamento: ");
    double preco = teclado.nextDouble();
    double litro2 = preco/litro;
    System.out.println("Ele conseguiu colocar "+litro2+" litros");


    
}
}
