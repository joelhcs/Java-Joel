package exercicios;
import java.util.Scanner;
public class Uni4Ex02 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Entre com um valor inteiro maior do que 0: ");
    int valor = scan.nextInt();
    if (valor%2==0) {
        System.out.println("Número é par");

        }    else {
            System.out.println("Número é ímpar");

        }
        
    

}
}
