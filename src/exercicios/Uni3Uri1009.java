package exercicios;
import java.util.Scanner;
public class Uni3Uri1009 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String nome = scan.next();
    double salarioFixo = scan.nextDouble();
    double vendas = scan.nextDouble();
    double salarioTotal = salarioFixo + vendas*15/100;
    System.out.printf("TOTAL = R$ %.2f" , salarioTotal);
    System.out.println("");
    scan.close();
}
}
