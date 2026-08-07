package exercicios_semestre1;
import java.util.Scanner;
public class Uni4Ex09 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número: ");
    double valor1 = sc.nextInt();
    System.out.println("Digite outro número: ");
    double valor2 = sc.nextInt();
    if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
        System.out.println("Os valores são múltiplos.");
    } else {
        System.out.println("Os valores não são múltiplos.");
    }
        
    }
}