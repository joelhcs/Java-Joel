package exercícios;
import java.util.Scanner;
public class Ex12 {
public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    System.out.println("Qual é o seu nome?");
    String nome = teclado.next();
    System.out.println("Quantas horas você trabalhou no mês?");
    short horas = teclado.nextShort();
    System.out.println("Informe o número de dependentes que você tem:");
    byte dependentes = teclado.nextByte();
    double salarioTrabalho = horas * 10;
    double salarioFamilia = dependentes * 60;
    double salarioBruto = salarioTrabalho + salarioFamilia;
    double desconto = salarioTrabalho * 13.5/100;
    double salarioLiquido = salarioBruto - desconto;
    System.out.println("O funcionário " + nome + " possui um salário bruto de R$" + salarioBruto + " e um salário líquido de R$" + salarioLiquido);



}
}
