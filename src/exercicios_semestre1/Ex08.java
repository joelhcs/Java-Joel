package exercicios_semestre1;
import java.util.Scanner;
public class Ex08 {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Quantos dólares o cliente te deu?");
    double dolar = teclado.nextDouble();
    System.out.println("Cotação do dólar hoje: ");
    double conversao = teclado.nextDouble();
    double reais = dolar*conversao;
    System.out.println("Você deve devolver " + reais + " reais para o cliente.");

    
}
}
