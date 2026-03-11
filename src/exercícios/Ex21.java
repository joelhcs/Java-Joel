package exercícios;
import java.util.Scanner;
public class Ex21 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Quantos kilos você pesa?");
    int peso = scan.nextInt();
    System.out.println("Qual a sua altura em metros?");
    double altura = scan.nextDouble();
    double imc = peso/Math.pow(altura, 2);
    System.out.println("O seu IMC é " + imc);
    
}
}
