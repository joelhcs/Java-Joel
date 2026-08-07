package exercicios_semestre1;
import java.util.Scanner;
public class Uni3Uri1010 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int codigo1 = scan.nextInt();
    int numeroPecas1 = scan.nextInt();
    double valorUnitario1 = scan.nextDouble();

    int codigo2 = scan.nextInt();
    int numeroPecas2 = scan.nextInt();
    double valorUnitario2 = scan.nextDouble();

    double valorTotal = numeroPecas1 * valorUnitario1 + numeroPecas2 * valorUnitario2;
    System.out.printf("VALOR A PAGAR: R$ %.2f" , valorTotal);
    System.out.println("");
    scan.close();
}
}
