package exercicios_semestre1;
import java.util.Scanner;
public class Uni4Ex03 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Escreva um número: ");
    int valor1 = scan.nextInt();
    System.out.println("Escreva outro número: ");
    int valor2 = scan.nextInt();
    if(valor1 > valor2) {
        System.out.println(valor1 + " é maior que " + valor2);
    }   else {
        System.out.println(valor2 + " é maior que " + valor1);
    }
    
        
    }
}

