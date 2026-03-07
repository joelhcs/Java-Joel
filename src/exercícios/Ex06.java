package exercícios;
import java.util.Scanner;
public class Ex06 {
public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    System.out.println("Quantos kilos tem o seu prato");
    double peso = teclado.nextDouble();
    double precoAlimento = (peso - 0.75) * 25;
    System.out.println("O preço da comida ficou R$" + precoAlimento);

}
}
