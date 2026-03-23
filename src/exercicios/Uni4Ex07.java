package exercicios;
import java.util.Scanner;
public class Uni4Ex07 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Entre com peso da carta: ");
    double peso = scan.nextDouble();
    double valorPagar = 0;
    if (peso <= 50) {
        valorPagar = 0.45;
        System.out.println("Custo do selo: " + valorPagar);
        }    else {
            double pesoExcedido = peso - 50;
            double qtAdicional = Math.ceil(pesoExcedido / 20);
            valorPagar = 0.45 + (0.45 * qtAdicional);
            System.out.printf("Custo do selo: %.2f\n", valorPagar);


        }
        
    
}
}
