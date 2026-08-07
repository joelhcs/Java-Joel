package exercicios_semestre1;
import java.util.Scanner;
public class Uni4Uri1046 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int inicio = sc.nextInt();
    int termino = sc.nextInt();
    int diferenca;
    if (termino > inicio) {
        diferenca = termino - inicio;
    } else if (termino == inicio) {
        diferenca = 24;
    } else {
        diferenca = (24 - inicio) + termino;
    }
    System.out.println("O JOGO DUROU " + diferenca + " HORA(S)");
}
}
