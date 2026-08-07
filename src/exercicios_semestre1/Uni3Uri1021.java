package exercicios_semestre1;
import java.util.Scanner;
public class Uni3Uri1021 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double valor = scan.nextDouble();
    int notas100 = (int) valor / 100;
    valor = valor % 100;
    int notas50 = (int) valor / 50;
    valor = valor % 50;
    int notas20 = (int) valor / 20;
    valor = valor % 20;
    int notas10 = (int) valor / 10;
    valor = valor % 10;
    int notas5 = (int) valor / 5;
    valor = valor % 5;
    int notas2 = (int) valor / 2;
    valor = valor % 2;
    int  moedas1 = (int) valor / 1;
    valor = (valor % 1) * 100;
    int moedas050 = (int) valor / 50;
    valor = valor % 50;
    int moedas025 = (int) valor / 25;
    valor = valor % 25;
    int moedas010 = (int) valor / 10;
    valor = valor % 10;
    int moedas05 = (int) valor / 5;
    valor = valor % 5;
    int moedas01 = (int) valor / 1;
    System.out.println("NOTAS:");
    System.out.println(notas100 + " nota(s) de R$ 100.00");
    System.out.println(notas50 + " nota(s) de R$ 50.00");
    System.out.println(notas20 + " nota(s) de R$ 20.00");
    System.out.println(notas10 + " nota(s) de R$ 10.00");
    System.out.println(notas5 + " nota(s) de R$ 5.00");
    System.out.println(notas2 + " nota(s) de R$ 2.00");
    System.out.println("MOEDAS:");
    System.out.println(moedas1 + " moeda(s) de R$ 1.00");
    System.out.println(moedas050 + " moeda(s) de R$ 0.50");
    System.out.println(moedas025 + " moeda(s) de R$ 0.25");
    System.out.println(moedas010 + " moeda(s) de R$ 0.10");
    System.out.println(moedas05 + " moeda(s) de R$ 0.05");
    System.out.println(moedas01 + " moeda(s) de R$ 0.01");
    scan.close();


}
}
