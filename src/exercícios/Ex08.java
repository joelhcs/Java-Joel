package exercícios;
import java.util.Scanner;
public class Ex08 {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Quantos dólares o cliente te deu?");
    double dolar = teclado.nextDouble();
    double reais = dolar*5.65;
    System.out.println("Você deve devolver " + reais + " reais para o cliente.");

    
}
}
