package exercicios;
import java.util.Scanner;
public class Ex09 {
public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    System.out.println("Qual é o raio da lata de óleo?");
    double raio = teclado.nextDouble();
    System.out.println("Qual a altura da lata de óleo?");
    double altura = teclado.nextDouble();
    double volume = 3.141592653589793*(raio*raio)*altura;
    System.out.println("O volume da lata de óleo é: " + volume);

}
}
