package exercicios_semestre1;
import java.util.Scanner;
public class Ex13 {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Qual a altura da parede em metros?");
    float altura = teclado.nextFloat();
    System.out.println("Qual o comprimento da parede em metros?");
    float comprimento = teclado.nextFloat();
    float area = comprimento * altura;
    float azulejo = area * 9;
    float custo = azulejo * 12.5f;
    System.out.println("O valor final é R$" + custo);


}
}
