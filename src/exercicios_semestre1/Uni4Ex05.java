package exercicios_semestre1;
import java.util.Scanner;
public class Uni4Ex05 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("A cor é azul?");
    boolean cor = scan.nextBoolean();
    if (cor) {
        System.out.println("Sim");
    } else {
        System.out.println("Não");

    }
}
}
