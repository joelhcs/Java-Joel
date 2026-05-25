package exercicios;
import java.util.Scanner;
public class Uni4Ex26 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escolha uma opção");
    System.out.println("T: calcular a área de um triângulo de base b e altura h");
    System.out.println("Q: calcular a área de um quadrado de lado l");
    System.out.println("R: calcular a área de um retângulo de base b e altura h");
    System.out.println("C: calcular a área de um círculo de raio r");
    char opcao = sc.next().toUpperCase().charAt(0);
    switch (opcao) {
        case 'T':
            System.out.println("Digite a base e a altura do triângulo: ");
            int base = sc.nextInt();
            int altura = sc.nextInt();
            System.out.println("Área do triângulo = " + (base * altura) / 2.0);
            break;
        case 'Q':
            System.out.println("Digite o lado:");
            int lado = sc.nextInt();
            System.out.println("Área do quadrado = " + lado * lado);
            break;
        case 'R':
            System.out.println("Digite a base e a altura do retângulo:");
            int b = sc.nextInt();
            int h = sc.nextInt();
            System.out.println("Área do retângulo = " + b * h);
            break;
        case 'C':
            System.out.println("Digite o raio:");
            int r = sc.nextInt();
            System.out.println("Área do círculo: " + Math.PI * Math.pow(r, 2));
            break;
        default:
            System.out.println("Opção inválida");
            break;
    }
}
}