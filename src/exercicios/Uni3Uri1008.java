package exercicios;
import java.util.Scanner;
public class Uni3Uri1008 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int funcionario = scan.nextInt();
    int horas = scan.nextInt();
    double valorHora = scan.nextDouble();
    double salario = horas * valorHora;
    System.out.println("NUMBER = " + funcionario);
    System.out.printf("SALARY = U$ %.2f" , salario);
    System.out.println("");
    scan.close();
}
}
