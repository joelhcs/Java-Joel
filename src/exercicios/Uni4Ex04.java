package exercicios;
import java.util.Scanner;
public class Uni4Ex04 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Escreva um número: ");
    double número = scan.nextDouble();
    número = número % 1;
    if (número > 0) {
        System.out.println("Esse número tem casa decimal");
    } else {
        System.out.println("Esse número não tem casa decimal");

        
    }
}
}
