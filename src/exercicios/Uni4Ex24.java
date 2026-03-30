package exercicios;
import java.util.Scanner;
public class Uni4Ex24 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe o valor  1:");
    int a = sc.nextInt();
    System.out.println("Informe o valor 2:");
    int b = sc.nextInt();
    System.out.println("Informe o valor 3:");
    int c = sc.nextInt();
    System.out.println("Escolha a opção (1 a 3):");
    int opcao = sc.nextInt();
    int valorMaior, valorMenor, valorMeio;
    if (a > b && a > c) {
        valorMaior = a;
    } else if (b > a && b > c) {
        valorMaior = b;
    } else{
        valorMaior = c;
    }
    if ((a > b && a < c) || (a > c && a < b)) {
        valorMeio = a;
    } else if ((b > a && b < c) || (b > c && b < a)) {
        valorMeio = b;
    } else{
        valorMeio = c;
    }
    if (a < b && a < c) {
        valorMenor = a;
    } else if (b < a && b < c) {
        valorMenor = b;
    } else{
        valorMenor = c;
    }
        switch (opcao) {
            case 1:
                System.out.println(valorMenor + " " + valorMeio + " " + valorMaior);
                break;
            case 2:
                System.out.println(valorMaior + " " + valorMeio + " " + valorMenor);
                break;
            case 3:
                System.out.println(valorMeio + " " + valorMaior + " " + valorMenor);
        }
}        
} 