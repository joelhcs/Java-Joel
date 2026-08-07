package exercicios_semestre2.lista01.questao02;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);   
        Pessoa pessoa1 = new Pessoa();

        System.out.println("Digite a sua altura:");
        pessoa1.altura = sc.nextDouble();

        System.out.println("Digite seu peso:");
        pessoa1.peso = sc.nextDouble();

        System.out.println("Seu IMC: " + pessoa1.calcularImc());
    }
}